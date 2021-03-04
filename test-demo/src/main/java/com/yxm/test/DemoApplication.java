package com.yxm.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: yuxiangming
 * @Date: 2021/3/3 15:31
 * @Description: 主启动类
 */
@EnableNeo4jRepositories
@MapperScan("com.yxm.test.mapper")
@SpringBootApplication
@EnableSwagger2
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
