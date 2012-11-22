package com.ambow.corejava.day2;

public class Student extends Person{
	private int sid ;
	
	private int a = 50;
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public Student(String name, String password, int sid) {
		super(name, password);
			this.sid = sid;
		
			System.out.println("Student.Student()");
	}
	public void show(){
		int a = 30;
		System.out.println("a的值"+a);//30
		System.out.println("this a"+this.a);//50
		System.out.println("super a"+super.a);//10
	}

}
