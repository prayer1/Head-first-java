package com.day1;

public class Player {
	int number = 0;
	public void guess(){
		number = (int)(Math.random()*10);
		System.out.println("I'm guessint " + number);
	}
}
