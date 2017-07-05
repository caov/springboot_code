package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 6:27 2017/7/5 0005
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskexecutor")
@EnableAsync //这个注解开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer{
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(25);
        taskExecutor.setMaxPoolSize(40);
        taskExecutor.setQueueCapacity(50);
        taskExecutor.initialize();
        return taskExecutor; //获得一个基于线程池TaskExecutor
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
