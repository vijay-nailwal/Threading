package com.example.thradlib.ThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Vijay on 01-09-2023.
 */
class PrintJob implements Runnable {
    String name;

    PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("... Job started by thread:" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {

        }
        System.out.println(name + " ...Job completed by thread" + Thread.currentThread().getName());
    }
}

public class ThreadPool1 {
    public static void main(String[] args) {
        PrintJob[] jobs = {new PrintJob("durga"),
                new PrintJob("ravi"),
                new PrintJob("shiva"),
                new PrintJob("pavan"),
                new PrintJob("suresh"),
                new PrintJob("anil"),};
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (PrintJob job : jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}
