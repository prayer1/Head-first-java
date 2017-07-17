package com.review5dayago;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Player {
    int number = 0;
    public void guess(){
        number = (int)(Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
