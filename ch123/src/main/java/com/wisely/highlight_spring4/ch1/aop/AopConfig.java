package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 5:08 2017/7/4 0004
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy //使用@EnableAspectJAutoProxy注解开启Spring对AspectJ的支持
public class AopConfig {
}
