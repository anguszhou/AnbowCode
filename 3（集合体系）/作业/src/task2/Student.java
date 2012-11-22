package task2;

import java.util.HashSet;

public class Student {
	/**
	 * 1��	����һ��Course�࣬����γ�
	 * ������һ��Student�࣬����ѧ����
	 * ��Student���а���һ��������һ��HashSet�Ķ���
	 * �����洢��ѧ����ѡ�����пγ̣����ṩ��Ӧ��addCourse(Course c)������
	 * ��ʾ���һ��ѡ��
      2������һ����SchoolClass����༶��
                 �����а���һ��������һ��HashSet�Ķ���
                �����洢�ð༶�����е�Student,���ṩ��Ӧ
                ��addStudent(Student s)������ʾ���һ��ѧ��
      3����������������һ��SchoolClass����
               ������ɸ�ѧ��������Ϊÿ��ѧ����������ſγ̣�
               ���Ҫͳ�Ƴ�ÿ�ſγ̵�ѡ��������
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
