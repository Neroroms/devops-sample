docker build -t build-curl:latest .

docker network create test-network --subnet 172.20.0.0/24

docker run -idt --name server --net test-network --ip 172.20.0.2 streamtank/print-log-only:latest
docker run -idt --name curl -e SERVER_URL=172.20.0.2 --net test-network build-curl:latest bash -c 'curl $SERVER_URL'