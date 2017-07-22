package com.day10;

import java.util.Scanner;

public class Clock {
    private Display hour;
    private Display minute;
    private Display second;
    public Clock(int h, int m, int s){
        hour = new Display(h);
        minute = new Display(m);
        second = new Display(s);
    }
    public void tick(){
            second.inCrease();
            if(second.getValue() == 60){
                minute.inCrease();
                if(minute.getValue() == 60){
                    hour.inCrease();
                }
            }
    }
    public String toString(){
        String message = String.format("%02d:%02d:%02d", hour.getValue(), minute.getValue(), second.getValue());
        return message;
    }

    public static void main(String[] args){
        Scanner in = new java.util.Scanner(System.in);
        Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
        clock.tick();
        System.out.println(clock);
        in.close();
    }
}
