package com.day8;

/**
 * Created by Administrator on 2017/7/18.
 */
public class RunThreads implements Runnable{
    public static void main(String[] args){
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("Alpha thread");
        beta.setName("Beat thread");
        alpha.start();
        beta.start();
    }
    public void run(){
        for(int i = 0; i < 25; i++){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running");
        }
    }
}
