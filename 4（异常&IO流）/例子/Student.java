package com.ambow.corejava.day4;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	
		private int age;
		
		private String name;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public Student(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}

		public String toString(){
			
			return "["+name+","+age+"]";
		}
}
