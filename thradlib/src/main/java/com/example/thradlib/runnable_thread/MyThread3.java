package com.example.thradlib.runnable_thread;

/**
 * Created by Vijay on 27-08-2023.
 */
public class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("child thread executed " + i);
        }
    }

    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        Thread thread = new Thread(myThread3);
        thread.start();
        for (int i = 0; i < 2; i++) {
            System.out.println("main thread executed " + i);
        }
    }
}
