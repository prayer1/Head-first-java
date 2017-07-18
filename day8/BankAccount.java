package com.day8;

/**
 * Created by Administrator on 2017/7/18.
 */
public class BankAccount {
    private  int balance = 100;
    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
}
