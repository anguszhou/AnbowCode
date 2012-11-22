package task2;

import java.util.HashSet;

public class Student {
	/**
	 * 1，	定义一个Course类，代表课程
	 * ；定义一个Student类，代表学生，
	 * 在Student类中包含一个属性是一个HashSet的对象，
	 * 用来存储该学生所选的所有课程，并提供相应的addCourse(Course c)方法，
	 * 表示添加一门选课
      2，定义一个类SchoolClass代表班级，
                 该类中包含一个属性是一个HashSet的对象，
                用来存储该班级中所有的Student,并提供相应
                的addStudent(Student s)方法表示添加一名学生
      3，在主方法中生成一个SchoolClass对象，
               添加若干个学生，并且为每个学生添加若干门课程，
               最后要统计出每门课程的选课人数。
	 */
	
	private String sname;
	
	private HashSet courseset=new HashSet() ;
    
	public Student() {
		
	}
	public Student(String sname, Course crs) {
		super();
		this.sname = sname;
		this.addCourse(crs);
	}
	
	public Student(String sname, HashSet courseset) {
		super();
		this.sname = sname;
		this.courseset = courseset;
	}

	
	
	public HashSet getCourseset() {
		return courseset;
	}

	public void setCourseset(HashSet courseset) {
		this.courseset = courseset;
	}

	
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void addCourse(Course crs)
	{
		courseset.add(crs);
	}

	
	
}
