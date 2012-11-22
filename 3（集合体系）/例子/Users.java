package com.ambow.corejava.day3;

public class Users implements Comparable{

		public Users(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

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
		
		public int compareTo(Object o) {
			
			Users st = (Users)o;
			
			if(this.age == st.getAge()){
				
				return this.name.compareTo(st.getName());
			}
			
			return  st.getAge()-this.age ;
		}
		
		public String toString(){
			
			return name+age;
		}
}
