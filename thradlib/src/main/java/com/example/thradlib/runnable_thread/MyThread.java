package com.example.thradlib.runnable_thread;

 class MyThread extends Thread{
     @Override
     public void run() {
         super.run();
         for (int i = 0; i < 2; i++) {
             System.out.println("child thread executed "+i);
         }
     }

     public static void main(String[] args) {
         MyThread myThread=new MyThread();
         myThread.start();//work like a thread.
         myThread.run();//work like a normal thread
        for (int i = 0; i < 2; i++) {
            System.out.println("main thread executed " + i);
        }
    }
}