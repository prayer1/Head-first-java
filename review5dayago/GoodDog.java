package com.review5dayago;

/**
 * Created by Administrator on 2017/7/15.
 */
public class GoodDog {
    private int size;

    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;

    }
    void bark(){
        if(size > 60){
            System.out.println("Wooof! Wooof!");
        } else if (size > 14){
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
