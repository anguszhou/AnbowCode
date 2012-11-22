package com.ambow.corejava.day4;

public class TestException1 {

		public static void main(String[] args) {
			
			try{
				
				System.out.println("Car.main()");
				
				System.exit(0);
				
			}catch(Exception e){
				
			e.printStackTrace();
			
			}finally{
					
				System.out.println("finally======");
					
				}
			}
		}

