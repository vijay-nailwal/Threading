package com.example.thradlib.threadlocal;

/**
 * Created by Vijay on 01-09-2023.
 */
class ParentThread1 extends Thread {
    public static InheritableThreadLocal t1 = new InheritableThreadLocal();
    @Override
    public void run() {
        super.run();
        t1.set("parent-object");
        System.out.println("Parent thread value-- " + t1.get());
        ChildThread1 ct = new ChildThread1();
        ct.start();
    }
}

class ChildThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Child thread value-- " + ParentThread1.t1.get());
    }
}

public class InheritableThreadLocalDemo {
    public static void main(String[] args) {
        ParentThread1 pt = new ParentThread1();
        pt.start();
    }
}
