package com.ambow.corejava.day2;

public class Cat  extends Animal{

		private String fish;

		
	

	

		public String getFish() {
			return fish;
		}


		public void setFish(String fish) {
			this.fish = fish;
		}


		public void eatFish(){
			
			System.out.println("Fish.eat()");
		}
		
		public Cat(String name, String fish) {
			super(name);
			this.fish = fish;
		}

		
}
