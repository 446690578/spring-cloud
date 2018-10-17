
spring cloud 练习


1.cloud-eureka  注册中心 8761

2.cloud-server1 注册服务 8762
提供断路器功能的demo
先访问http://localhost:8762/hi 再访问http://localhost:8762/hystrix.stream可以抓到报错的信息而不是一直ping
同时可以在http://localhost:8766/hystrix/查看相关的错误信息

3.cloud-server2 注册服务 8763

4.cloud-hystrix	 断路器
需要开启@EnableCircuitBreaker同时导入相关jar包
关键需要监控的实例项目使用断路器的注解@HystrixCommand，触发之后localhost

cloud-feign 	
cloud-ribbon	
cloud-zuul
