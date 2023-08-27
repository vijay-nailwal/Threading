package com.example.thradlib;

/**
 * Created by Vijay on 27-08-2023.
 */
class VenuFixing extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("VenuFixing");
    }
}

class WeddingCardPrinting extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("WeddingCardPrinting");
    }
}

class WeddingCardDistribution extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("WeddingCardDistribution");
    }
}

public class MyThread7 {
    public static void main(String[] args) throws InterruptedException {

        VenuFixing venuFixing = new VenuFixing();
        WeddingCardPrinting weddingCardPrinting = new WeddingCardPrinting();
        WeddingCardDistribution weddingCardDistribution = new WeddingCardDistribution();

        venuFixing.start();
        weddingCardPrinting.join();

        weddingCardPrinting.start();

        weddingCardPrinting.join();
        weddingCardDistribution.start();

    }
}
