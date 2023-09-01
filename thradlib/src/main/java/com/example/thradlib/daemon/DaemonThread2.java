package com.example.thradlib.daemon;

/**
 * Created by Vijay on 30-08-2023.
 */
class MyThread11 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex){

        }
        }

    }
}
public class DaemonThread2 {
    public static void main(String[] args) {
        MyThread11 t=new MyThread11();
        t.setDaemon(true);
        t.start();
        System.out.println("end of main thread");
    }
}
