package com.wisely.highlight_spring4.ch1.javaconfig;

/**
 * @Author:van
 * @Description java配置通过@Configuration和@Bean来实现
 * @Date: Create in 下午 2:18 2017/7/4 0004
 */
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}
