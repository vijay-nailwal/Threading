package com.example.thradlib.priority;

/**
 * Created by Vijay on 27-08-2023.
 */
public class MyThread6 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 2; i++) {
            System.out.println("priority "+Thread.currentThread().getPriority()+ " child thread executed " + i);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        MyThread6 myThread6=new MyThread6();
        myThread6.start();
        for (int i = 0; i < 2; i++) {
            System.out.println("priority "+ Thread.currentThread().getPriority()+ " main thread executed "+i);
        }
    }
}
