docker run -idt \
  --name mirror-registry \
  --restart=always \
  --network registry-test \
  --ip 172.50.0.2 \
  -p 45000:5000 \
  -e REGISTRY_PROXY_REMOTEURL="https://registry-1.docker.io" \
  -v $(pwd)/volumes/docker-mirror/:/var/lib/registry \
  registry:2