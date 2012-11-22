package com.ambow.corejava.day2;

public class Animal {

		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void eat(){
			
			System.out.println("Animal.eat()");
		}

		public void fly(){
			
			System.out.println("Animal.fly()");
		}
		public Animal(String name) {
			super();
			this.name = name;
		}
}
