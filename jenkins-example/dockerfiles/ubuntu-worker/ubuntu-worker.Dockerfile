FROM ubuntu:18.04

RUN apt-get update
RUN apt-get install -y vim openssh-server default-jre

CMD service ssh start

COPY id_rsa /root/.ssh/id_rsa
COPY authorized_keys /root/.ssh/authorized_keys

ENTRYPOINT service ssh start && bash