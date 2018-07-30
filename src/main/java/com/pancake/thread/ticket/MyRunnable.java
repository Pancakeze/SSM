package com.pancake.thread.ticket;

/**
 * Created by zhibingze on 2018/7/27.
 */
public class MyRunnable implements  Runnable {

    private int ticketCount = 5;

    @Override
    public void run() {
        while (ticketCount >0) {
            ticketCount--;
            System.out.println(Thread.currentThread().getName()+"卖了一张票，剩余票数为："+ticketCount);
        }
    }
}
