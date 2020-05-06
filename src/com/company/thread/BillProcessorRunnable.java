package com.company.thread;

public class BillProcessorRunnable implements Runnable {

    private long mobileNumber;
    
    public BillProcessorRunnable(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public void run() {
        process();
    }
    
    public void process() {
        try {
            System.out.println("Start " + mobileNumber);
            Plan.getPlan();
            System.out.println("End   " + mobileNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
