package com.qhit.ThreadTest;

/**
 * @Date:2019/6/14
 * @Description:
 * @version:1.0
 */
public class ThreadTest implements Runnable {
    Integer a=0;
    public ThreadTest(Integer b){
        this.a=b;
    }
    @Override
    public void run() {
        System.out.println("sh:"+a);asd
    }
}
