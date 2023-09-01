package com.example.thradlib.runnable_thread;

/**
 * Created by Vijay on 27-08-2023.
 */

//Case 3: if we override start method then our start method will be executed just like a normal
// method call and no new thread will be created. It is not recommended to override start method
// otherwise don’t go for multithreading concept.


public class MyThread2 extends Thread {
    @Override
    public synchronized void start() {
        super.start();
        System.out.println("start method executed ");
    }

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        System.out.println("main thread");
    }
}
