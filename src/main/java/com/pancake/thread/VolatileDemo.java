package com.pancake.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhibingze on 2018/7/24.
 *
 *  volatile 关键字
 *      能够保证volatile变量的可见性
 *      不能保证volatile变量复合操作的原子性
 *
 *  如何实现内存可见性：
 *      深入的讲：
 *          通过加入内存屏障和禁止重新排序优化来实现
 *       对volatile变量执行写操作时，会在写操作后加入一条store屏障指令
 *       对volatile变量执行读操作时，会在读操作前加入一条load屏障指令
 *
 *   线程写volatile变量过程：
 *      1。改变工作内存中volatile变量副本的值
 *      2。将改变后的副本的值从工作内存刷新到主内存
 *   线程读volatile变量过程
 *      1。从主内存中读取volatile变量的最新值到线程的工作内存中
 *      2。从工作过内存中读取volatile变量的副本
 *
 *   volatile使用场景
 *      1。对变量的写入操作不依赖于当前值
 *      eg: 不满足   a++,a=a*5;
 *          满足     boolean类型的没问题
 *      2。该变量没有包含在具有其他变量的不变式中
 *      eg： volatile int a=2;
 *           volatile int b=3;
 *         不满足   if(a>b)
 *
 *
 *      synchronized和volatile的比较
 *      1。volatile不需要加锁，比synchronized更加轻量，不会阻塞线程
 *      2。从内存可见性角度讲，volatile读相当于加锁，volatile写相当于解锁
 *      3。synchronized既能保证可见性，又能保证原子性，而volatile只能保证可见性
 *
 */
public class VolatileDemo {

    private Lock lock = new ReentrantLock();
    // 由于synchronized不能修饰变量，所以共享数据的访问权限定义成private
    // 能够使其set方法添加synchronized，保证线程的安全，原子性和可见性
    private  int number =0;

    public int getNumber() {
        return this.number;
    }

    public  void  increase() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock.lock();
        try{
            this.number++;
        }finally {
            lock.unlock();
        }



    }

    public static void main(String []args){

        final VolatileDemo vd = new VolatileDemo();

        for (int i = 0; i < 200; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    vd.increase();
                }
            }).start();
        }

        // 如果还有子线程在运行，主线程就让出cpu资源
        // 直到所有的子线程都运行完了，主线程再继续往下执行
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println("number: "+vd.getNumber() );
    }
}
