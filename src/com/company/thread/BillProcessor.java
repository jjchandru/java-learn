package com.company.thread;

public class BillProcessor extends Thread {
    
    private long mobileNumber;
    
    public BillProcessor(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public void run() {
        process();
    }
    
    public void process() {
        try {
            System.out.println("Start " + mobileNumber);
            Thread.sleep(1000);
            System.out.println("End   " + mobileNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

