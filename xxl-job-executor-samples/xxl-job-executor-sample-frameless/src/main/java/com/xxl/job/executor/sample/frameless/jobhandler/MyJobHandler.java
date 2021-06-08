package com.xxl.job.executor.sample.frameless.jobhandler;

import com.xxl.job.core.handler.IJobHandler;

/**
 * 通过 继承IJobHandler 指定任务
 * @author qixf
 * @create 2021-05-27 15:19
 */
public class MyJobHandler extends IJobHandler {

    @Override
    public void execute() throws Exception {
        System.out.println("MyJobHandler.execute");
    }

    public void init() throws Exception {
        System.out.println("MyJobHandler.init");
    }

    public void destroy() throws Exception {
        System.out.println("MyJobHandler.destroy");
    }
}
