package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author:van
 * @Description
 * @Date: Create in 上午 11:02 2017/7/5 0005
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{ //实现ApplicationListener接口，并指定监听的事件类型
    public void onApplicationEvent(DemoEvent event){
        String msg = event.getMsg();

        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息:"+ msg);
    }
}
