package com.review5dayago;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/7/15.
 */
public class GameHelper {
    boolean flag = true;
    int t = 0;
    public String getUserInput(String  prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
    public ArrayList<String> placeDotCom(){
        ArrayList<String> place = new ArrayList<String>();
       if(flag == true && t == 0){
           String a = "D1";
           String b = "D2";
           String c = "D3";
           place.add(a);
           place.add(b);
           place.add(c);
           flag = false;
           t++;
       } else if(flag == false && t == 1){
           String a = "C1";
           String b = "C2";
           String c = "C3";
           place.add(a);
           place.add(b);
           place.add(c);
           flag = true;
           t++;
       } else if(t == 2 && flag == true){
           String a = "B1";
           String b = "B2";
           String c = "B3";
           place.add(a);
           place.add(b);
           place.add(c);
       }
        return place;
    }
}
