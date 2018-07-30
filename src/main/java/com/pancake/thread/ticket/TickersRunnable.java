package com.pancake.thread.ticket;

/**
 * Created by zhibingze on 2018/7/27.
 *
 * 线程的生命周期：
 *  1。创建
 *  2。就绪状态
 *  3。运行状态。
 *  4。
 */
public class TickersRunnable {
    public static void main(String []args){

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable, "窗口1");
        Thread thread2 = new Thread(myRunnable, "窗口2");
        Thread thread3 = new Thread(myRunnable, "窗口3");

        thread.start();
        thread2.start();
        thread3.start();


    }
}
