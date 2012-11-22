package com.ambow.corejava.day2;

public class Person {

		private String name;
		
		private String password;

		 int a = 10;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		

		public Person(String name, String password) {
		super();
		this.name = name;
		this.password = password;
		
		System.out.println("Person.Person()");
	}

		
}
