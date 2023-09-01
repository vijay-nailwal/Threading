package com.example.thradlib.threadlocal;

/**
 * Created by Vijay on 01-09-2023.
 */
class ParentThread2 extends Thread {
    public static InheritableThreadLocal t1 = new InheritableThreadLocal(){
        public Object childValue(Object p){
            return "child thread";
        };
    };
    @Override
    public void run() {
        super.run();
        t1.set("parent-object");
        System.out.println("Parent thread value-- " + t1.get());
        ChildThread2 ct = new ChildThread2();
        ct.start();
    }
}

class ChildThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Child thread value-- " + ParentThread2.t1.get());
    }
}

public class InheritableThreadLocalDemo1 {
    public static void main(String[] args) {
        ParentThread2 pt = new ParentThread2();
        pt.start();
    }
}