package com.day7;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/17.
 */
public class Mooc {
    public static void main(String[] args){
        int number;
        int count = 0;
        int result;
        int t = 0;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        do {
            result = number % 10;
            t = t*10 + result;
            System.out.print(result);
            number = number / 10;
            count++;
        } while(number != 0);
        System.out.println(t);
        System.out.println(count);
    }
}
