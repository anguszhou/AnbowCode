package com.ambow.corejava.day2;

public class Teacher  extends Person{
	
	private String course;

		public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
		
	public Teacher(String name, String password ,String course ) {
			super(name, password);
			this.course = course;
		}
}
