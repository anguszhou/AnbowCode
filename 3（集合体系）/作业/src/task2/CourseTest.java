package task2;

import java.util.Iterator;

public class CourseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		
		Course []crs=new Course [5];
		
		crs[0]=new Course(1,"��������","��");
		crs[1]=new Course(2,"���ݿ�ԭ��","��");
		crs[2]=new Course(3,"�㷨���","��");
		crs[3]=new Course(4,"����","��");
		crs[4]=new Course(5,"����ϵͳ","��");
		
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
	    	   System.out.println("�γ̣�"+crs[i].getCourseName()+
	    			   "ѡ��ѧ�������У�"+num[i]);
	    	
	}

}
