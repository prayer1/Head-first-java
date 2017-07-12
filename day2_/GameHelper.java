package com.day2_;
import java.io.*;
import java.util.ArrayList;
public class GameHelper {
	int b = 0;
	boolean flag = false;
	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(
					new InputStreamReader(System.in));
			inputLine = is.readLine();
			if(inputLine.length() == 0) return null;
		} catch (Exception e) {
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
	public ArrayList<String> placeDotCom(int a){
		ArrayList<String> arr = new ArrayList<String>();
		if(b == 0){
			arr.add("D2");
			arr.add("D3");
			arr.add("D4");
			b++;
			flag = true;
		} else if(flag == true && b == 1){
			arr.add("B0");
			arr.add("C0");
			arr.add("D0");
			b++;
			flag = false;
		} else if(flag == false && b == 2){
			arr.add("G3");
			arr.add("G4");
			arr.add("G5");
		}

		return arr;
	}
}
