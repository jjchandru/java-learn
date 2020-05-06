package com.company.thread;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BillGenerator {

    public static void main(String args[]) throws InterruptedException {

        LocalDateTime start = LocalDateTime.now();
        ArrayList<BillProcessor> processors = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            BillProcessor processor = new BillProcessor(i);
            processor.start();
            processors.add(processor);
        }
        
        for (BillProcessor processor : processors) {
            processor.join();
        }
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Duration in seconds: "
                + Duration.between(start, end).getSeconds());
    }

}

