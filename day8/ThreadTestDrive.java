package com.day8;

/**
 * Created by Administrator on 2017/7/18.
 */
public class ThreadTestDrive {
    public static void main(String[] args){
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("back in main");
    }

}
