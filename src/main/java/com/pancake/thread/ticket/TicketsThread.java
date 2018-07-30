package com.pancake.thread.ticket;

/**
 * Created by zhibingze on 2018/7/27.
 */
public class TicketsThread {


    public static void main(String []args){

        // 创建三个线程模拟窗口卖票

        MyThread winodw = new MyThread("窗口1");
        MyThread winodw2 = new MyThread("窗口2");
        MyThread winodw3 = new MyThread("窗口3");

        // 启动这三个线程，开始卖票

        winodw.start();
        winodw2.start();
        winodw3.start();
    }
}
