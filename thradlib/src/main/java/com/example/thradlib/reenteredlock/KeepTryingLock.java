package com.example.thradlib.reenteredlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Vijay on 31-08-2023.
 */

class MyThreadKeepTrying extends Thread {
    static ReentrantLock l = new ReentrantLock();

    MyThreadKeepTrying(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        do {
            try {
                if (l.tryLock(3000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName()+"... got lock");
                    Thread.sleep(30000);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName()+"... release lock");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " unable to get lock and will try again.. ");
                }
            } catch (InterruptedException ex) {

            }
        }
        while (true);
    }
}

public class KeepTryingLock {
    public static void main(String[] args) {
        MyThreadKeepTrying t1 = new MyThreadKeepTrying("First Thread");
        MyThreadKeepTrying t2 = new MyThreadKeepTrying("Second Thread");
        t1.start();
        t2.start();
    }
}