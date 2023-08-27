package com.example.thradlib;

/**
 * Created by Vijay on 27-08-2023.
 */
public class MyThread5 extends Thread{
    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        MyThread5 myThread5=new MyThread5();
        System.out.println(myThread5.getName());

        Thread.currentThread().setName("MyThread5");
        System.out.println(Thread.currentThread().getName());
    }
}
