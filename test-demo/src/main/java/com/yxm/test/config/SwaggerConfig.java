package com.yxm.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author: yuxiangming
 * @Date: 2021/3/4 9:36
 * @Description: swagger配置类
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yxm.test")) //指定提供接口所在的基包
                .build();
    }

    /**
     * 该套 API 说明，包含作者、简介、版本、host、服务URL
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("neo4j api")
                .contact(new Contact("测试接口","null","yxm1136656235@163.com"))
                .version("0.1")
                .termsOfServiceUrl("localhost:8080/")
                .description("neo4j test api")
                .build();
    }
}
