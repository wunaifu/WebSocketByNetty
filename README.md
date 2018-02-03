# Netty
学习教程：https://www.imooc.com/comment/941    
git:https://github.com/xxg3053/WebSocketByNetty  

## Netty使用场景
1. 高性能领域
2. 多线程并发领域
3. 异步通信领域



## 课程前置知识
1. 有一定的Java基础
2. 一定的IO编程基础
3. java IO通信

## Java IO通信

1. BIO通信
一个线程负责连接   
一请求一应答   

2. 伪异步IO通信   
线程池负责连接
M请求
 
3. NIO通信

4. AIO通信


## WebSocket入门

## Netty实现webSocket通信案例
1. 将maven更改为阿里的源,maven的setting.xml中的<mirrors>标签中添加：
```
<mirror>
    <!--This sends everything else to /public -->
    <id>nexus-aliyun</id>
    <mirrorOf>*</mirrorOf>
    <name>Nexus aliyun</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public</url>
</mirror>
```

2. Netty的依赖
```
<dependency>   
        <groupId>io.netty</groupId>
        <artifactId>netty-all</artifactId>
        <version>5.0.0.Alpha1</version>
</dependency>
```
    
