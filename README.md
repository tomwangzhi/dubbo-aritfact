# dubbo-aritfact
dubbo服务端和消费端，以及集成的zookeeper demo脚手架
集成的zookeeper在启动类main方法执行之前执行

# demo-client
该组件为消费端

# demo-server
该组件为服务端

# 服务类
HelloService

# 使用服务类
只需像spring那样注入即可，不过采用注解@Reference

# 使用方式
1. 启动demo-server的启动类DemoApplication
2. 启动demo-client的启动类DemoApplication

# 服务调用方式
1. 只需在application.properties中配置好应用程序名称
配置好注册中心id和注册中心地址
2. 在应用中使用注解@Reference注入服务类，即可调用服务提供方的方法实现
