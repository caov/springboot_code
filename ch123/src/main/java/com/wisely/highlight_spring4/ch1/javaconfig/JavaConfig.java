package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 2:23 2017/7/4 0004
 */
@Configuration //表名当前类是一个配置类
public class JavaConfig {

    @Bean //使用@Bean注解声明当前方法FunctionService的返回值是一个Bean，Bean的名称是方法名
    public FunctionService functionService(){
        return  new FunctionService();
    }

    /*@Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());//直接调用functionService()方法
        return useFunctionService;
    }*/

    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){ //参数注入Bean
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }

}
