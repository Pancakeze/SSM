package com.pancake.thread;

/**
 * Created by zhibingze on 2018/7/24.
 *
 * 1。thread 线程的创建
 *      Thread（）
 *      Thread（String name）
 *      Thread（Runnable target）
 *      Thread（Runnable target，String name）
 * 2。线程的方法
 *      void start() 线程的启动
 *
 *      static void sleep(long mills) 线程休眠
 *      static void sleep(long mills, int nanos)
 *
 *      void join()
 *      void join(long mills)
 *      void join(long mills, int nanos) 使其他线程等待当前线程终止
 *
 *      static void yield()              当前运行线程释放处理器资源
 *
 *      static Thread currentthread()    返回当前运行的线程的引用
 *
 */
public class FirstThread extends Thread{

    @Override
    public void run() {
        System.out.println(getName()+"是一个演员!");

        int count =0;
        boolean flag = true;
        while (flag) {
            System.out.println(getName() + "登台演出" + (++count));

            if (count == 100) {
                flag = false;
            }
            if (count % 10 == 0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(getName()+"表演结束!");

    }
    public static void main(String []args){
        Thread ft = new FirstThread();
        ft.setName("Mr .Thread");
        ft.start();

        Thread actress = new Thread(new Actress(), "Ms. Runnable");
        actress.start();

    }
}

