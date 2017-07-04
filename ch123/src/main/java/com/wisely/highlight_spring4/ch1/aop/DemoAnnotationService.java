package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 2:41 2017/7/4 0004
 */
@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作")
    public void  add(){}
}
