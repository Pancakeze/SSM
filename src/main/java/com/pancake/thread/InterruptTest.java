package com.pancake.thread;

/**
 * Created by zhibingze on 2018/7/24.
 */
public class InterruptTest extends Thread {

    public static void main(String []args){
        InterruptTest interruptTest = new InterruptTest();
        System.out.println("Starting Thread.....");

        interruptTest.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Interrupt thread.....");
        interruptTest.interrupt();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stopping application....");

    }

    @Override
    public void run() {

        while (!this.isInterrupted()) {
            System.out.println("Thread is running .....");

            long time = System.currentTimeMillis();

            while ((System.currentTimeMillis() - time) < 1000) {
                // 该while循环相当于 sleep(1000)
            }
/*
            // 这种方法 将会抛除异常  也不会进行终止
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
