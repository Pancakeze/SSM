package com.pancake.thread.day01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by zhibingze on 2018/7/30.
 */
public class DaemonThread implements Runnable {
    @Override
    public void run() {
        System.out.println("进入守护线程"+Thread.currentThread().getName());


        try {
            writeToFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("退出守护线程"+Thread.currentThread().getName());

    }

    private void writeToFile() throws Exception{
        File filename = new File(File.separator+"Users"+File.separator+"zhibingze"+File.separator+"daemon.txt");
        if (!filename.exists()) {
            filename.createNewFile();
        }
        OutputStream os = new FileOutputStream(filename,true);
        int count = 0;

        while (count < 999) {
            os.write(("\r\nword" + count).getBytes());
            System.out.println("守护线程" + Thread.currentThread().getName() + "向文件中写入了word" + count++);
            Thread.sleep(1000);
        }
    }


}
