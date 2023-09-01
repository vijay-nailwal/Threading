package com.example.thradlib.reenteredlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Vijay on 31-08-2023.
 */
class MThread extends Thread {
    static ReentrantLock l = new ReentrantLock();

    public MThread(String firstThread) {
        super(firstThread);
    }


    @Override
    public void run() {
        super.run();
        if (l.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "not lock and performing safe operation");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                l.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "unable to get lock and performing else operation");
        }
    }
}

public class TryLock {
    public static void main(String[] args) {
        MThread t1 = new MThread("First Thread");
        MThread t2 = new MThread("Second Thread");
        t1.start();
        t2.start();
    }
}
