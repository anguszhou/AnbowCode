package com.ambow.corejava.day3;

public class Student implements Comparable {
							
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
		
		StringBuffer jpsb = new StringBuffer("[");
		
		jpsb.append(age).append(",").append(name).append("]");
		
		return jpsb.toString();
	}

	@Override
	public int hashCode() {
		
			return name.hashCode()^age;
	}

	
	public boolean equals(Object obj) {
		
		if(obj instanceof Student){
			
			Student stu = (Student)obj;
			
			if(this.name.equals(stu.getName()) && this.age == stu.getAge()){
				
				return true;
			}
		}
		return false;
	}


	public int compareTo(Object o) {
		
		Student st = (Student)o;
		
		if(this.age == st.getAge()){
			
			return this.name.compareTo(st.getName());
		}
		
		return  st.getAge()-this.age ;
	}
	
	
}








