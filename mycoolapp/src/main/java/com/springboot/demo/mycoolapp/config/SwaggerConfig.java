package com.springboot.demo.mycoolapp.config;//package com.springboot.demo.mycoolapp.config;
//
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//              .select()
//              .apis(RequestHandlerSelectors.basePackage("com.springboot.demo.mycoolapp.controller"))
//              .apis(RequestHandlerSelectors.any())
//              .paths(PathSelectors.any())
//              .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//              .title("MyCoolApp API")
//              .license("Apache License Version 2.0")
//              .description("MyCoolApp API")
//              .version("1.0")
//                .description("MyCoolApp API")
//              .build();
//    }
//}
