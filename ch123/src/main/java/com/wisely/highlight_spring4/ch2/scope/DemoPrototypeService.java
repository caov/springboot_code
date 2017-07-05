package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 6:24 2017/7/4 0004
 */
@Service
@Scope("prototype") //@Scope("Prototype")每次调用都会新建一个Bean的实例
public class DemoPrototypeService {

}
