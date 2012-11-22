package task1;

import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Teacher implements Comparable{

	/**
	 * 定义一个Teacher类，包含3个属性：name,age,salary。
	 * 并且定义若两个对象的name和age都相同，则认为这两个对象相等。
              要求该Teacher类对象能比较大小，按照age的大小来排序，
              如果age相同的则按salary大小来排。
              最后，生成一些Teacher对象，
              加入到TreeSet验证以上程序的正确性。

	 */
	
	/* 姓名 */
	private String name ;
	
	/* 年龄 */
	private int age;
	
	/* 工资 */
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

	
	/* 比较两个Teachaer对象是否相同 */
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
