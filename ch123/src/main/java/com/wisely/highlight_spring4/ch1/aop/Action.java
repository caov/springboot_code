package com.wisely.highlight_spring4.ch1.aop;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;

/**
 * @Author:van
 * @Description 注解和xml一样都是一种元数据，注解的功能来自用这个注解的地方
 * @Date: Create in 下午 2:38 2017/7/4 0004
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
