package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 6:51 2017/7/5 0005
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

   @Scheduled(fixedRate = 1000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 32 19 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定的时间" + dateFormat.format(new Date()) + "执行");
    }

    public void a(){
        System.out.println(111111);
    }
}
