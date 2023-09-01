package com.example.thradlib.thread_enhancement;

/**
 * Created by Vijay on 31-08-2023.
 */
class MyThread extends Thread {
    MyThread(ThreadGroup g, String name) {
        super(g, name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("child thread");
        try {
            sleep(5000);
        } catch (InterruptedException ex) {
        }
    }
}

public class ThreadGroup3 {
    public static void main(String[] args) throws InterruptedException{
        ThreadGroup pg = new ThreadGroup("ParentGroup");
        ThreadGroup cg = new ThreadGroup(pg, "ChildGroup");
        MyThread t1 = new MyThread(pg, "ChildThread1");
        MyThread t2 = new MyThread(pg, "ChildThread2");
        t1.start();
        t2.start();
        System.out.println(pg.activeCount());
        System.out.println(pg.activeGroupCount());
        pg.list();
        Thread.sleep(10000);
    }
}
