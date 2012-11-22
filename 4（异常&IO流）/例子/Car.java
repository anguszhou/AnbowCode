package com.ambow.corejava.day4;

public class Car {

		public void go(String address) throws TooFarException{
			
			if(address.equals("shanghai")){
				
				throw new TooFarException(address+"is too far");
			}
			
		}
}
