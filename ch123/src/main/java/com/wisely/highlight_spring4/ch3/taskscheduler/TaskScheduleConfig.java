package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 7:01 2017/7/5 0005
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskscheduler")
@EnableScheduling //通过这个注接开启对计划任务的支持
public class TaskScheduleConfig {
}
