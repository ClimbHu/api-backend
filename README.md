## API 接口开发平台后
### 项目介绍

一个提供 API 接口供开发者调用的平台。
用户可以注册登录，开通接口调用权限。用户可以浏览接口并调用，且每次调用会进行统计。
管理员可以发布接口、下线接口、接入接口，以及可视化接口的调用情况、数据。

### 技术选型

#### 后端

- Java Spring Boot
- MyBatis、MyBatis Plus
- Spring Session Redis 分布式登录
- Lombok 注解
- Spring AOP
- Spring Boot Starter（SDK 开发）
- Dubbo（RPC）、Nacos
- Spring Cloud Gateway（网关、限流、日志实现）
- Apache Commons Lang3 工具类
- Swagger + Knife4j 接口文档
- 全局请求响应拦截器（记录日志）
- 全局异常处理器
- 自定义错误码
- 封装通用响应类
- 示例 SQL（用户表）
