package com.example.thradlib.threadlocal;

/**
 * Created by Vijay on 01-09-2023.
 */
class ParentThread extends Thread {
    public static ThreadLocal t1 = new ThreadLocal();
    @Override
    public void run() {
        super.run();
        t1.set("parent-object");
        System.out.println("Parent thread value-- " + t1.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }
}

class ChildThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Child thread value-- " + ParentThread.t1.get());
    }
}

public class ThreadLocalDemo4 {
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        pt.start();
    }
}
