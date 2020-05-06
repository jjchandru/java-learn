package com.company.thread;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BillGeneratorThreadPool {

    public static void main(String args[]) throws InterruptedException {

        LocalDateTime start = LocalDateTime.now();
        ExecutorService executor = Executors.newFixedThreadPool(1000);
        for (int i = 0; i < 10000; i++) {
            Runnable worker = new BillProcessorRunnable(i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Duration in seconds: "
                + Duration.between(start, end).getSeconds());
    }
}
