package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 2:00 2017/7/4 0004
 */
@Service //使用@Service注解声明当前的FunctionService类是spring管理的一个bean
public class FunctionService {

    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}
