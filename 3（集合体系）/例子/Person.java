package com.ambow.corejava.day3;

public class Person implements Comparable {

		private int age;
		
		private String name;
		
		private int salary;
		
		public Person(int age, String name, int salary) {
			super();
			this.age = age;
			this.name = name;
			this.salary = salary;
		}

		public String toString(){
			
			StringBuffer jpsb = new StringBuffer("[");
			
			jpsb.append(age).append(",").append(name).append("]");
			
			return jpsb.toString();
		}

		@Override
		public int hashCode() {
			
				return name.hashCode()^age^salary;
		}

		
		public boolean equals(Object obj) {
			
			if(obj instanceof Student){
				
				Person stu = (Person)obj;
				
				if(this.name.equals(stu.getName()) && this.age == stu.getAge()){
					
					return true;
				}
			}
			return false;
		}


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

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public int compareTo(Object o) {
			
			Person st = (Person)o;
			
			if(this.age == st.getAge()){
				
				return this.name.compareTo(st.getName());
			}
			
			return  st.getAge()-this.age ;
		}
		
}
