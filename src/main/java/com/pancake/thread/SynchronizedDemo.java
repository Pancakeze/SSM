package com.pancake.thread;

/**
 * Created by zhibingze on 2018/7/24.
 *
 *  synchronized 能够实现：
 *      原子性（同步）
 *      可见性
 *                两条规定：
 *    线程解锁前：必须把共享变量的最新值刷新到主内存中
 *    线程加琐时：将清空工作内存中共享变量的值，从而使用共享变量时需要从主内存中重新读取最新的值
 *
 *    线程执行互斥代码的过程：
 *
 *    1。获得互斥锁
 *    2。清空工作内存
 *    3。从主内存拷贝变量的最新副本到工作内存
 *    4。执行代码
 *    5。将更改后的共享变量的值刷新到主内存
 *    6。释放互斥锁
 *
 *    指令重排序：
 *    重排序：
 *    1。编译器优化重排序（编译器优化）
 *    2。指令级并行重排序（处理器优化）
 *    3。内存系统的重排序（处理器优化）
 *
 *    as-if-serial
 *    无论如何重新排序，程序执行的结果应该与代码顺序执行的结果一致（java编译器、运行时和处理器都会保证java在但线程下遵循as-if-serial语义）
 *
 *
 *    导致共享变量在线程间不可见的原因：
 *    1。线程的交叉执行                                                 原子性
 *    2。重排序结合线程交叉执行                                          原子性
 *    3。共享变量更新后的值没有在工作内存与主内存间及时更新（未及时更新）      可见性
 */
public class SynchronizedDemo {

    // 共享变量
    private boolean ready = false;
    private int result = 0;
    private int number =1;

    // 写操作
    public void write() {
        ready = true;
        number = 2;

    }

    // 读操作
    public void read() {
        if (ready) {
            result = number * 3;
        }
        System.out.println("result的值为"+result);
    }

    // 内部线程类
    private  class ReadWriteThread extends Thread{
        private boolean flag;

        public ReadWriteThread(boolean flag) {
            this.flag = flag;
        }

        @Override
        public void run() {
            if (flag) {
                write();
            }else{
                read();
            }
        }
    }

    public static void main(String []args){

        SynchronizedDemo thread  = new SynchronizedDemo();

        thread.new ReadWriteThread(true).start();
        thread.new ReadWriteThread(false).start();
    }
}
