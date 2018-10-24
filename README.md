
spring cloud 练习


1.cloud-eureka  注册中心 8761
默认是8761端口，其他微服务不填eureka注册服务时会默认注册8761端口的注册中心
2.cloud-server1 注册服务 8762
提供断路器功能的demo
先访问http://localhost:8762/hi 再访问http://localhost:8762/hystrix.stream可以抓到报错的信息而不是一直ping
同时可以在http://localhost:8766/hystrix/查看相关的错误信息

3.cloud-server2 注册服务 8763

4.cloud-hystrix	 断路器
需要开启@EnableCircuitBreaker同时导入相关jar包
关键需要监控的实例项目使用断路器的注解@HystrixCommand，触发之后localhost

5.cloud-feign 	

6.cloud-ribbon	

7.cloud-zuul
智能路由，1.@EnableZuulProxy开启，需要在配置文件中添加zuul.routes相关的配置才能生效，会自动对请求进行分流。例:http://localhost:8767/api-b/v9/showNewConfig?code=8seconds&language=ZH-CN&token=11
2.在1)中的url中token是来验证url是否有效的，这设计到ZuulFilter的自定义扩展类的实现逻辑
