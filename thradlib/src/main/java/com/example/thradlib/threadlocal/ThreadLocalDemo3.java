package com.example.thradlib.threadlocal;

/**
 * Created by Vijay on 01-09-2023.
 */
class CustomerThread extends Thread {
    static Integer custId = 0;
    private static ThreadLocal t1 = new ThreadLocal() {
        protected Integer initialValue() {
            return ++custId;
        }
    };

    CustomerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName() + " executing with customer id  " + t1.get());
    }
}

public class ThreadLocalDemo3 {
    public static void main(String[] args) {
        CustomerThread c1 = new CustomerThread("customer thread-1");
        CustomerThread c2 = new CustomerThread("customer thread-2");
        CustomerThread c3 = new CustomerThread("customer thread-3");
        CustomerThread c4 = new CustomerThread("customer thread-4");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
