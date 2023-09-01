package com.example.thradlib.interrupt;

/**
 * Created by Vijay on 27-08-2023.
 */
public class MyThread8 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("I am lazy thread");
                sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("My Thread got interrupted");
            }
        }
    }

    public static void main(String[] args) {
        MyThread8 myThread8=new MyThread8();
        myThread8.start();
        myThread8.interrupt();//main thread is interrupting child thread.child thread interrupted.
        System.out.println("end of main thread");
    }
}
