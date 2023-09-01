package com.example.thradlib.daemon;

/**
 * Created by Vijay on 30-08-2023.
 */
class MyThread10 extends Thread {}

public class DaemonThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());//false
//cannot change main thread to DaemonThread.
//        Thread.currentThread().setDaemon(true);//IllegalThreadStateException
        MyThread10 t = new MyThread10();
        System.out.println(t.isDaemon());//false
        t.setDaemon(true);
        System.out.println(t.isDaemon());//true
    }
}
