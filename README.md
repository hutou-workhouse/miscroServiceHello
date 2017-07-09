# miscroServiceHello
准备书写一个系统的文章，发表在简书上，这里是演示用源码。
1. spring boot的介绍: http://www.jianshu.com/p/222020b15104
2. 微服务例子
3. 如何结合Docker进行实践

待续，未完。。。。。

## springbootDemo1
一个最基本的服务，基于Spring Boot，使用Maven打包
```
mvn package
java -jar app1.jar --server.port=8020
```

## springbootDemo2
通过代码重新Java Config的使用逻辑

## springbootDemo3
Spring boot的启动和基本原理；
Spring boot的扩展

## springbootStarter
演示了如何使用基本的starter。

## eurekaServerHa
演示如何搭建高可用的Eureka服务器。主机名为：master，backup
```
java -jar eurekaHa.jar --spring.profiles.active=master
java -jar eurekaHa.jar --spring.profiles.active=backup
```

## eurekaClient
一个最简单的服务，注册到Eureka服务器上

## springCloudConfigServer
一个配置服务器的演示，集群的搭建
可以通过下面的配置启动git的存储方式
```
java -jar configServer.jar --spring.profiles.active=git
```

## springCloudConfigClient
如何使用配置服务器的配置信息

## eurekaCustomer
进行服务的消费，消费eurekaClient服务的例子
使用两种方式：Ribbon + RestTemplate，Feign进行消费
Ribbon的负载均衡相关配置
进行自定义扩展

## springCloudConfigBusServer
通过消息总线 spring cloud bus进行配置文件的刷新，配置中心

## springCloudConfigBusClient
通过消息总线 spring cloud bus进行配置文件的刷新，消费配置的服务

## springCloudHystrixFeign
在Feign中使用Hystrix

## springCloudHystrixRibbon
在Ribbon中使用Hystrix
使用Hystrix Dashboard进行监控