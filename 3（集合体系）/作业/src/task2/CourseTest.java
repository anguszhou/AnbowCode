package task2;

import java.util.Iterator;

public class CourseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		
		Course []crs=new Course [5];
		
		crs[0]=new Course(1,"计算机组成","王");
		crs[1]=new Course(2,"数据库原理","李");
		crs[2]=new Course(3,"算法设计","徐");
		crs[3]=new Course(4,"日语","朱");
		crs[4]=new Course(5,"操作系统","梁");
		
		int []num=new int[crs.length];
		
		Student []stu=new Student [3];
		
		stu[0]=new Student("ta",crs[0]);
		stu[0].addCourse(crs[2]);
		stu[0].addCourse(crs[4]);
		
		stu[1]=new Student("ni",crs[2]);
		stu[1].addCourse(crs[1]);
		stu[1].addCourse(crs[3]);
		stu[1].addCourse(crs[4]);
		
		stu[2]=new Student("wo",crs[2]);
		stu[2].addCourse(crs[3]);
	
		SchoolClass sc=new SchoolClass("ambow-java",stu[0]);
		sc.addStudent(stu[1]);
		sc.addStudent(stu[2]);
		
		Iterator sit =sc.getStudentset().iterator();
		
	    while(sit.hasNext())
	    {
	    	Student s=(Student) sit.next();
	    	
	    	Iterator<Course> cit=s.getCourseset().iterator();
	    	
	    	while(cit.hasNext())
	    	{
	    	    num[cit.next().getId()-1]++;
	    	}
	    }
	    for(int i=0;i<num.length;i++)    	
	    	   System.out.println("课程："+crs[i].getCourseName()+
	    			   "选修学生人数有："+num[i]);
	    	
	}

}
