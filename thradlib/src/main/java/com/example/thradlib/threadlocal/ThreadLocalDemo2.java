package com.example.thradlib.threadlocal;

/**
 * Created by Vijay on 01-09-2023.
 */
public class ThreadLocalDemo2 {
    public static void main(String[] args) {
        ThreadLocal t1 = new ThreadLocal() {
            public Object initialValue() {
                return "abc";
            }
        };
        System.out.println(t1.get());//abc
        t1.set("vijay");
        System.out.println(t1.get());//vijay
        t1.remove();
        System.out.println(t1.get());//abc
    }
}
