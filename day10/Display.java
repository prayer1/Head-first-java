package com.day10;

public class Display {
    private int value;
    private int limit;
    public Display(int limit){
        this.limit = limit;
    }
    public void  inCrease(){
            value++;
            if(value == limit){
                value = 0;
            }
    }
    public int getValue(){
        return value;
    }
}
