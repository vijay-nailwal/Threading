package com.example.thradlib;

/**
 * Created by Vijay on 27-08-2023.
 */
public class MyThread9 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            System.out.println("i am lazy thread " + i);
        }
        System.out.println("i am entering into sleeping state");
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("i got interrupted");
        }
    }
}

class ThreadSleepDemo {
    public static void main(String[] args) {
        MyThread9 myThread9 = new MyThread9();
        myThread9.start();
        myThread9.interrupt();
        //If there is a sleep method in target thread then main thread is interrupting child thread.
        // child thread interrupted but after sleep.
        System.out.println("end of main thread");
    }
}