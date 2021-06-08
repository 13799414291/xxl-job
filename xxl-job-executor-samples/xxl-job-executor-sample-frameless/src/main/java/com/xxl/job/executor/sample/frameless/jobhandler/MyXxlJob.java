package com.xxl.job.executor.sample.frameless.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;

import java.util.concurrent.TimeUnit;

/**
 * 在方法上指定任务
 * @author qixf
 * @create 2021-05-27 15:00
 */
public class MyXxlJob {

    @XxlJob("myJobHandler")
    public void demoJobHandler() throws Exception {
        String jobParam = XxlJobHelper.getJobParam();
        System.out.println(jobParam);
        XxlJobHelper.log("my xxl job...");
        for (int i = 0; i < 5; i++) {
            System.out.println("beat at:" + i);
        }
    }

}
