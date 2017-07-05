package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author:van
 * @Description
 * @Date: Create in 上午 11:08 2017/7/5 0005
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;//注入ApplicationContext用来发布事件

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
