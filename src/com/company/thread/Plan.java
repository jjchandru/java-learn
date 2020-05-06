package com.company.thread;

public class Plan {

    public synchronized static Plan getPlan() throws InterruptedException {
        Thread.sleep(1000);
        return null;
    }

}
