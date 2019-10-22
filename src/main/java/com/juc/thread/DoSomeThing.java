package com.juc.thread;

import java.util.concurrent.TimeUnit;

/**
 * thread
 *
 * @author wangjun
 * time:2019/10/22 11:21 上午
 **/

public class DoSomeThing {

    private volatile int age = 10;


    public int getAge() {
        return age;
    }

    public synchronized void getTotalAge(){
        for (int i=0;i<10;i++){
            age = age + 10;
            System.out.println("pre age="+age);
            System.out.println(Thread.currentThread().getName()+"执行加法+"+10);
            System.out.println("age="+age);
        }
    }

    public synchronized void sleepSecond(){
        try {
            System.out.println("当前线程开始休息："+Thread.currentThread().getName()+":2s");
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {

        }
    }
}
