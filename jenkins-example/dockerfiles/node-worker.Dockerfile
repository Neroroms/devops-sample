FROM node:12.13.0

RUN apt-get update
RUN apt-get install -y vim openssh-server default-jre

COPY id_rsa /root/.ssh/id_rsa
COPY authorized_keys /root/.ssh/authorized_keys

ENTRYPOINT service ssh start && bash