package com.example.thradlib.reenteredlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Vijay on 31-08-2023.
 */
class Display {
    ReentrantLock l = new ReentrantLock();

    public void wish(String name) {
        l.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("good morning");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
            System.out.println(name);
        }
        l.unlock();
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        d.wish(name);
    }
}

public class RenterantLockExample {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "vijay");
        MyThread t2 = new MyThread(d, "gaurav");
        MyThread t3 = new MyThread(d, "gaurav123");
        t1.start();
        t2.start();
        t3.start();
    }
}
