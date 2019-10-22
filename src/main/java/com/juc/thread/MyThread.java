package com.juc.thread;

/**
 * thread
 *
 * @author wangjun
 * time:2019/10/22 11:19 上午
 **/

public class MyThread extends Thread {

    private DoSomeThing doSomeThing;

    public MyThread(DoSomeThing doSomeThing) {
        this.doSomeThing = doSomeThing;
    }

    @Override
    public void run() {
        doSomeThing.getTotalAge();
    }
}
