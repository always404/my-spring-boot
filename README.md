1. 先配置application.yml文件里的数据库信息
2. 将ojdbc6的驱动手动导入本地的maven库，导入命令如下
```shell
# -Dfile是本地存放jar包的地址
# -Dmaven.repo.local是本地maven仓库 
# 如果没有配置，默认是 C:\Users\xxx\.m2，则不需要加上这部分
mvn install:install-file -Dfile=D:\IdeaProjects\my-spring-boot\ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.3.0 -Dpackaging=jar -Dmaven.repo.local=D:\apache-maven-repos
```

3. 本地数据库建表 一共三个表 如下


jpa_users

| id   | user_name | sex  | age  |
| ---- | --------- | ---- | ---- |
| 1    | u1        | 女   | 21   |
| 2    | u2        | 男   | 22   |
| 3    | u3        | 男   | 23   |
| 4    | u4        | 女   | 24   |

jpa_address

| id   | user_name | address  |
| ---- | --------- | -------- |
| 1    | u1        | 浙江宁波 |
| 2    | u2        | 江苏南京 |
| 3    | u3        | 江西九江 |
| 4    | u4        | 浙江杭州 |

jpa_users_add

| user_name | sex  | adderss |
| --------- | ---- | ------- |
|           |      |         |


4. 项目启动后，访问http://localhost:8080/swagger-ui.html
5. 点开要测试的接口，try it now 然后 execute