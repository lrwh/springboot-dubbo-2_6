
## 基于 springboot + dubbo2.6 (alibaba dubbo | dubbox) + zookeeper 简单示例 demo

dubbo 小版本可以自行替换

## 如何启动
1. dubbo 采用 zookeeper 作为注册中心，所以需要先启动zk

2. 启动 dubbo-provider2

3. 启动 dubbo-provider

4. 启动 dubbo-client

## 访问

通过浏览器或者 url 进行访问 http://localhost:8081/hierarchy

调用顺序

dubbo-client -->  dubbo-provider --> dubbo-provider2

