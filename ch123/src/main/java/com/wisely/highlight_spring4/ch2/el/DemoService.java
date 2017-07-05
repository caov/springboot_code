package com.wisely.highlight_spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 6:54 2017/7/4 0004
 */
@Service
public class DemoService {

    @Value("其他类的属性") //此处为注入普通字符串
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
