package com.juc.thread;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * thread
 *
 * @author wangjun
 * time:2019/10/22 11:13 上午
 **/

@SpringBootTest
public class ThreadTest1{


    @Test
    void test1()throws Exception{
        DoSomeThing doSomeThing = new DoSomeThing();
        MyThread myThread1 = new MyThread(doSomeThing);
        myThread1.setName("线程1");
        MyThread myThread2 = new MyThread(doSomeThing);
        myThread2.setName("线程2");
        myThread2.start();
        myThread1.start();
    }
}
