package com.pancake.thread;

/**
 * Created by zhibingze on 2018/7/24.
 *
 * 隋唐演义大戏舞台
 */
public class Stage extends Thread {

    @Override
    public void run() {
        System.out.println("欢迎观看隋唐演义！");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("大幕徐徐拉开");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("话说..........................");

        ArmyRunnable armyRunnable = new ArmyRunnable();
        ArmyRunnable armyRunnable1 = new ArmyRunnable();


        Thread thread = new Thread(armyRunnable,"隋军");
        Thread thread1 = new Thread(armyRunnable1,"农民起义军");

        // 启动线程，让军队开始作战
        thread.start();
        thread1.start();

        // 舞台线程休眠，大家专心观看军队厮杀
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("正当对方激战正酣，半路杀出个程咬金");

        Thread thread2 = new KeyPersonThread();
        thread2.setName("Mr. cheng");

        System.out.println("程咬金的理想就是结束战争，使百姓安居乐业...");

        // 停止军队作战
        // 停止线程的方法
        armyRunnable.flag = false;
        armyRunnable1.flag = false;


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 历史关键人物

        thread2.start();

        // 万众瞩目，所有线程等待程先生完成历史使命
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("战争结束，人民安居乐业，程先生实现了积极的人生理想，为人民做出了贡献");
        System.out.println("谢谢观看隋唐演义，再见！");
    }

    public static void main(String []args){
        new Stage().start();

    }
}
