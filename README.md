# gRPC Spring-boot
gRPC is a modern open source high performance Remote Procedure Call (RPC) framework that can run in any environment. It can efficiently connect services in and across data centers with pluggable support for load balancing, tracing, health checking and authentication. It is also applicable in last mile of distributed computing to connect devices, mobile applications and browsers to backend services.
## Getting Started
Generate client and server side code from our .proto service definition
```zsh
cd proto
mvn compile
```
Run both microservice ClientApplication and ServerApplication
```
```
Access via localhost port 8080
```zsh
curl http://localhost:8080/author/1 | jq '.'
```
