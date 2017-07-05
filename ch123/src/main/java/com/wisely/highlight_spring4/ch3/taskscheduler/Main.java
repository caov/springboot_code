package com.wisely.highlight_spring4.ch3.taskscheduler;

import com.wisely.highlight_spring4.ch3.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 7:03 2017/7/5 0005
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);
    }
}
