package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author:van
 * @Description
 * @Date: Create in 下午 6:34 2017/7/5 0005
 */
@Service
public class AsyncTaskService {

    @Async //通过@Async注解表明该方法是个异步方法。
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务：" +i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1："+(i+1));
    }
}
