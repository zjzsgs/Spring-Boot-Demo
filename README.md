#demo来自慕课网自整理
2小时学会Spring Boot http://www.imooc.com/learn/767
##创建springboot应用
	- 手动自建
	- idea内置spring initializr  可以删除mvnw、mvnw.cmd和.mvn文件夹
	- 在官网定制下载
##启动应用
	- 运行类调用main入口 @SpringBootApplication
	- maven启动 mvn spring-boot:run 在module根目录 Ctrl+C停止
	- 打包启动mvn install打包到target目录，jar -jar jarname.jar [--dev]运行参数 table键候补提示
##项目属性文件
	- .properties
	- .yml（推荐）冒号后面有空格
	- 正常localhost:8080/hello
	- 修改server.port=8081 server.context-path=/demo
	- 访问localhost:8080/demo/hello
##自定义属性
	- 配置url: www
	- 使用@Value("${url}") private String url;
	- 配置嵌套：content: "name: ${name},age: ${age}"
	- 前缀配置类，@Component //Autowired注入 - @ConfigurationProperties(prefix = "girl")//前缀配置类
	- 开发-测试-生产环境配置
	spring.profiles.active=prod //使用生产环境配置application-prod.yml
	- 启动多个环境 java -jar jarName.jar --spring.profiles.active=dev
##Restful API
	1. 查 get /users
	2. 增 post /users
	3. 得 get /users/{id}
	4. 改 put /users/{id}
	5. 删 delete /users/{id}
##spring-boot-jpa
	- 实体类注解@Entity、@Id、@GenerateId、@Column
	- 可以实现类到数据库的映射（自动创建）
	- EntityRepository接口继承JpaRepository<Entity,Integer>封装了基本数据库操作，自定义方法名必须遵循规则。
##事务管理
	- import javax.transaction.Transactional;
	- //import org.springframework.transaction.annotation.Transactional;
	- 注解@Transactional可以配置属性


