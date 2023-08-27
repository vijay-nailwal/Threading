package com.example.thradlib;

/**
 * Created by Vijay on 27-08-2023.
 */
public class MyThread4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("child thread executed " + i);
        }
    }

    public static void main(String[] args) {

        MyThread4 runnable = new MyThread4();
        Thread thread = new Thread();
        Thread thread1 = new Thread(runnable);

        thread.start();//New thread will be created and it will call Thread class run method which has empty implementation.
        thread.run();//No new thread will be created and Thread class run method just like call normal method.

        thread1.start();//New thead will be created MyRunnable run() will be executed.
        thread1.run();//No  New thead will be created MyRunnable run() will be executed just like call normal method.

//      runnable.start();//complile time error cannot find symbol mehtod name start().
        runnable.run();//MyRunnable run() will be executed just like call normal method.
    }

}
