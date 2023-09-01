package com.example.thradlib.threadlocal;

/**
 * Created by Vijay on 01-09-2023.
 */
public class ThreadLocalDemo1 {
    public static void main(String[] args) {
        ThreadLocal t1 = new ThreadLocal();
        System.out.println(t1.get());//null
        t1.set("vijay");
        System.out.println(t1.get());//vijay
        t1.remove();
        System.out.println(t1.get());//null
    }
}
