package com.company.thread;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BillGeneratorRunnable {

    public static void main(String args[]) throws InterruptedException {

        LocalDateTime start = LocalDateTime.now();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BillProcessorRunnable processor = new BillProcessorRunnable(i);
            Thread thread = new Thread(processor);
            thread.start();
            threads.add(thread);
        }
        
        for (Thread thread : threads) {
            thread.join();
        }
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Duration in seconds: "
                + Duration.between(start, end).getSeconds());
    }

}
