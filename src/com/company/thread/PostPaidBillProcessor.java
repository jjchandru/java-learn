package com.company.thread;

public class PostPaidBillProcessor extends Thread {
    
    private long mobileNumber;
    
    public PostPaidBillProcessor(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public long getMobileNumber() {
        return mobileNumber;
    }
    
    public void run() {
        try {
            processBill();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void processBill() throws InterruptedException {
        System.out.println("Started process for " + mobileNumber);
        Thread.sleep(1000);
        System.out.println("Ended process for " + mobileNumber);
    }

}
