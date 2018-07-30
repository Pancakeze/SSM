package com.pancake.thread.day01;

/**
 * Created by zhibingze on 2018/7/30.
 *
 *  java线程有两大类：
 *  用户线程：运行在前台，执行具体的任务
 *          程序的主线程、连接网路的子线程都是用户线程
 *  守护线程：运行在后台，为其他前台线程服务
 *     特点：一旦所有用户线程都结束运行，守护线程会随着jvm一起结束工作。
 *     应用：数据库连接池中的检测线程
 *          jvm虚拟机启动后的检测线程
 *          垃圾回收线程（最常见）
 *  如何设置守护线程？
 *      可以调用Thread类的setDaemon(true)方法，来设置当前线程为守护线程
 *  设置守护线程注意事项：
 *      setDaemon(true)必须在start()方法之前调用，否则会抛除IllegalThreadStateException异常
 *      在守护线程中产生的新线程也是守护线程
 *      不是所有的任务都可以分配给守护线程来执行，比如读写操作或计算逻辑。
 */

public class Day01thread {
}
