package com.ambow.corejava.day4;

public class Pseron {

		private String address = "kunshan";
		
		Car car = new Car();
		
		public void play(){
			
				try {
					car.go(address);
				} catch (TooFarException e) {
					
					e.printStackTrace();
				}
			
		}
		
		public static void main(String[] args) {
			
			Pseron person = new Pseron();
			
			person.play();
		}
}
