package task1;

import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Teacher implements Comparable{

	/**
	 * ����һ��Teacher�࣬����3�����ԣ�name,age,salary��
	 * ���Ҷ��������������name��age����ͬ������Ϊ������������ȡ�
              Ҫ���Teacher������ܱȽϴ�С������age�Ĵ�С������
              ���age��ͬ����salary��С���š�
              �������һЩTeacher����
              ���뵽TreeSet��֤���ϳ������ȷ�ԡ�

	 */
	
	/* ���� */
	private String name ;
	
	/* ���� */
	private int age;
	
	/* ���� */
	private int salary ; 
	
	
	public Teacher(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int hashCode() {
		
		return name.hashCode()^age^salary;
}

	
	/* �Ƚ�����Teachaer�����Ƿ���ͬ */
	public boolean equals (Object obj)
	{
		System.out.print("dfsdfsd");
		if(obj instanceof Teacher)
		{
			Teacher tea=(Teacher)obj;
			if(this.name.equals(tea.getName())&&this.getAge()==tea.getAge())
				return true;
			}
		return false;
	}

      public int compareTo(Object obj) {
		
		Teacher tea = (Teacher)obj;
		
		
		if(this.age == tea.getAge()){
			
		return this.compareToSalary(tea);
		}
		
		return  this.age-tea.getAge() ;
	}
		
    
      public int compareToSalary(Teacher tea) {
  		
  		return this.salary-tea.getSalary();
  	}	
      
  	public String toString()
  	{
  		StringBuffer sb=new StringBuffer("[");
  		
  		sb.append(this.name).append(":").append(this.age).append("--").append(this.salary).append("]");
  		
  		return sb.toString();
  		
  	}
  	
  		
  	
	

}
