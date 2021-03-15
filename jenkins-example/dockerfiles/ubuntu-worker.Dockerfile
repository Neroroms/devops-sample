#jenkins-worker-ubuntu:18.04
FROM ubuntu:18.04

RUN apt-get update
RUN apt-get install -y vim openssh-server default-jre
RUN apt-get install -y git curl wget

COPY id_rsa /root/.ssh/id_rsa
COPY authorized_keys /root/.ssh/authorized_keys

ENTRYPOINT service ssh start && bash