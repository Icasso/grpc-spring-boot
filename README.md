# gRPC Spring-boot
gRPC is a modern open source high performance Remote Procedure Call (RPC) framework that can run in any environment. It can efficiently connect services in and across data centers with pluggable support for load balancing, tracing, health checking and authentication. It is also applicable in last mile of distributed computing to connect devices, mobile applications and browsers to backend services.

## RPC methods
#### Unary - synchronous
Client will send one request and wait for one response
```
rpc getAuthor(Author) returns (Author) {}
```
#### Server-streaming - asynchronous
Client will send one request and server will respond with stream of messages to the client
```
rpc getBooksByAuthor(Author) returns (stream Book) {}
```
#### Client-streaming - asynchronous
Client will send stream of messages and server will respond with one response
```
rpc getExpensiveBook(stream Book) returns (Book) {}
```
#### Bi-directional - asynchronous
Client will send stream of messages and server will respond back with stream of messages
```
rpc getBookByAuthorGender(stream Book) returns (stream Book) {}
```

## Getting Started
Generate client and server side code from our .proto service definition
```zsh
cd proto
mvn compile
```
```
Run both microservice ClientApplication and ServerApplication
```
Access endpoints via localhost port 8080
```zsh
// unary - synchronous
http://localhost:8080/author/1

// server-streaming - asynchronous
http://localhost:8080/book/1

// client-streaming - asynchronous
http://localhost:8080/book

// bi-directional - asynchronous
http://localhost:8080/book/author/male
```
