package com.day2;

public class Dog {
	String name;
	public void bark(){
		System.out.println(name + " says Ruff!");
	}
	public static void main(String[] args){
		//����dog����
		Dog dog1 = new  Dog();
		dog1.name = "Bart";
		//����dog����
		Dog[] myDogs = new 	Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		//ͨ���������ô�ȡdog
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		System.out.println("last dog's name is ");
		System.out.println(myDogs[2].name);
		
		//�����dogִ��bark
		int x = 0;
		while(x < myDogs.length){
			myDogs[x].bark();
			x = x + 1;
		}
	}
} 
