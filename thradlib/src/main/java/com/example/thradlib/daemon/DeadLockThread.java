package com.example.thradlib.daemon;

/**
 * Created by Vijay on 30-08-2023.
 */
class A {
    public synchronized void d1(B b) {
        System.out.println("Thread1 starts execution of d1()");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ex) {
        }
        System.out.println("Thread1 trying to call B's last()");
        b.last();
    }

    public synchronized void last() {
        System.out.println("Inside A, this is last() method");
    }
}

class B {
    public synchronized void d2(A a) {
        System.out.println("Thread2 starts execution of d2()");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ex) {
        }
        System.out.println("Thread2 trying to call B's last()");
        a.last();
    }

    public synchronized void last() {
        System.out.println("Inside B, this is last() method");
    }
}

public class DeadLockThread extends Thread {
    A a = new A();
    B b = new B();

    public void m1() {
        this.start();
        a.d1(b);//this line executed by main thread
    }

    @Override
    public void run() {
        super.run();
        b.d2(a);//this line executed by child thread
    }

    public static void main(String[] args) {
        DeadLockThread deadLockThread = new DeadLockThread();
        deadLockThread.m1();
    }
}
