FROM docker:20.10.3-dind

RUN apk update
RUN apk add openjdk11
RUN apk add wget

RUN wget https://repo.jenkins-ci.org/releases/org/jenkins-ci/plugins/swarm-client/3.24/swarm-client-3.24.jar

COPY ./daemon.json /etc/docker/daemon.json

ENTRYPOINT java -jar swarm-client-3.24.jar \
            -master http://172.20.0.2:8080 \
            -mode "exclusive" \
            -labels "dind" \
            -name "dind" \
            -username "admin" \
            -password "12345"
