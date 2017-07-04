package com.wisely.highlight_spring4.ch1.javaconfig;


/**
 * @Author:van
 * @Description 这里没有用注解
 * @Date: Create in 下午 2:03 2017/7/4 0004
 */

public class UseFunctionService {

   FunctionService functionService;

   public void setFunctionService(FunctionService functionService){
       this.functionService = functionService;
   }

    public String sayHello(String word){
       return functionService.sayHello(word);
    }
}
