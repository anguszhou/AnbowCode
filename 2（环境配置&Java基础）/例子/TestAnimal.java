package com.ambow.corejava.day2;

public class TestAnimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			Animal a = new Dog("wangcai",12);
			
			System.out.println(a instanceof Animal);
			
			System.out.println(a instanceof Dog);
			
			System.out.println(a instanceof Cat);
			
			//a.sleep();
			//a.fly();
			a.eat();

	}

}









