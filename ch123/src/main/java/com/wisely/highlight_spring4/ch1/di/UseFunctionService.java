package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 2:03 2017/7/4 0004
 */
@Service
public class UseFunctionService {

   //使用@Autowired将FunctionService的实体bean注入到UseFunctionService中，让UseFunctionService具备FunctionService功能
   @Autowired
   FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
