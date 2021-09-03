package com.lz.finance.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author zhengzz
 * @version 1.0.0
 * @className Knife4jConfiguration
 * @description knife配置
 * @date 2021/9/3
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {
    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .description("Finance Lz")
                        .termsOfServiceUrl("http://www.xx.com/")
                        .contact(new Contact("zzz","","2570389155@qq.com"))
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("lz")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.lz.finance"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
