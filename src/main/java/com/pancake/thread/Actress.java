package com.pancake.thread;

/**
 * Created by zhibingze on 2018/7/24.
 */
public class Actress implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"是一个演员!");

        int count =0;
        boolean flag = true;
        while (flag) {
            System.out.println(Thread.currentThread().getName() + "登台演出" + (++count));

            if (count == 100) {
                flag = false;
            }
            if (count % 10 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+"表演结束!");
    }
}
