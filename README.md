# SpringCloud 微服务示例项目

这是一个使用Spring Cloud框架构建的微服务示例项目，用于演示微服务架构的基本组件和最佳实践。

## 项目信息

- 项目名称：springcloud-demo
- 开发者：likanug
- 创建日期：2024-05-22
- 开发环境：JDK 21
- 构建工具：Maven 3.x

## 技术栈

- Spring Boot：2.7.18
- Spring Cloud：2021.0.8
- Java：21
- Maven：3.11.0

## 项目结构

```txt
springcloud-demo/
├── eureka-service/      # 服务注册中心
├── config-service/      # 配置管理中心
├── gateway-service/     # API网关服务
├── user-service/        # 用户服务模块
└── pom.xml             # 父工程POM
```

## 模块说明

### 1. Eureka Service（服务注册中心）

- 模块名：eureka-service
- 端口：8761
- 主要功能：提供服务注册与发现
- 访问地址：<http://localhost:8761>

### 2. Config Service（配置管理中心）

- 模块名：config-service
- 端口：8888
- 主要功能：集中管理各服务的配置文件
- 访问地址：<http://localhost:8888>

### 3. Gateway Service（API网关服务）

- 模块名：gateway-service
- 端口：8080
- 主要功能：统一的API路由和过滤
- 访问地址：<http://localhost:9000>

### 4. User Service（用户服务）

- 模块名：user-service
- 端口：8081
- 主要功能：用户相关的业务功能
- 访问地址：<http://localhost:8081>

## 快速开始

### 环境要求

- JDK 21 或更高版本
- Maven 3.x
- Windows/Linux/MacOS

### 构建步骤

1. 克隆项目

```powershell
git clone [项目地址]
cd springcloud-demo
```

2. 编译项目

```powershell
mvn clean install
```

3. 启动服务注册中心

```powershell
cd eureka-server
mvn spring-boot:run
```

### 验证部署

访问Eureka管理控制台：<http://localhost:8761>

## 开发指南

### 添加新服务

1. 在根目录下创建新的服务模块
2. 在父pom.xml中添加新模块
3. 配置新服务的pom.xml依赖
4. 编写服务代码
5. 在application.yml中配置服务信息

## 构建和部署

### Maven构建命令

```powershell
mvn clean install    # 构建所有模块
mvn spring-boot:run # 运行单个服务
```

## 版本控制

- 使用Git进行版本控制
- 遵循[语义化版本](https://semver.org/lang/zh-CN/)规范

## 注意事项

1. 确保JDK版本与pom.xml中配置的版本匹配（JDK 21）
2. 所有微服务模块都应该注册到Eureka Server
3. 修改配置文件时注意保持版本兼容性

## 参与贡献

1. Fork 项目
2. 创建特性分支
3. 提交变更
4. 推送到分支
5. 创建Pull Request

## 许可证

MIT License

## 联系方式

- 作者：likanug
- 组织：[组织名称]
- 邮箱：[邮箱地址]

## 更新日志

### V1.1.0 (2024-05-23)

- 添加Config Service配置管理中心
- 添加Gateway Service API网关服务
- 添加User Service用户服务模块

### V1.0.0 (2024-05-22)

- 初始化项目
- 添加Eureka Service服务注册中心
