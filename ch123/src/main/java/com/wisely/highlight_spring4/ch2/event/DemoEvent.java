package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author:van
 * @Description 自定义事件，继承ApplicationEvent
 * @Date: Create in 上午 10:46 2017/7/5 0005
 */
public class DemoEvent extends ApplicationEvent{
    private static final long serialVersionUID = 1L;

    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
