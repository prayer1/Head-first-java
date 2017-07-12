package com.day2;

import java.util.ArrayList;

public class DotComTestDrive {
	public static void main(String[] args){
		int numOfGuesses = 0;//记录玩家猜测次数的变量
		DotCom dot = new DotCom();
		GameHelper helper = new GameHelper();
		ArrayList<String> randomNum = new ArrayList<>();
		int a = (int)(Math.random()*5);
		String a1 = Integer.toString(a);
		String a2 = Integer.toString(a + 1);
		String a3 = Integer.toString(a + 2);
		randomNum.add(a1);
		randomNum.add(a2);
		randomNum.add(a3);
		dot.setLocationCells(randomNum);
		boolean isAlive = true;
		
		while(isAlive == true){
			String guess = helper.getUserInput("enter a number:");
			String result = dot.checkYourself(guess);
			numOfGuesses++;
			System.out.println(result);
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
