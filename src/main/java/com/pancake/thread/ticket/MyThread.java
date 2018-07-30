package com.pancake.thread.ticket;

/**
 * Created by zhibingze on 2018/7/27.
 */
public class MyThread extends  Thread{
    private int ticketCount = 5;

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (ticketCount >0) {
            ticketCount--;
            System.out.println(name+"卖了一张票，剩余票数为："+ticketCount);
        }
    }
}
