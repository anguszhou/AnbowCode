package com.ambow.corejava.day2;

public class Dog  extends Animal{




		private int age;

		
		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public void eat(){
			
			System.out.println("Dog.eat()");
		}
		

		public void sleep(){
			
			System.out.println("Dog.sleep()");
		}
		
		public Dog(String name, int age) {
			super(name);
			this.age = age;
		}
}
