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
一个配置服务器的演示

## springCloudConfigClient
如何使用配置服务器的配置信息
