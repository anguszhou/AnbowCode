package com.ambow.corejava.day3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			Set set = new TreeSet();
			
			/*tudent student1 = new Student(12,"icexu");
			
			Student student2 = new Student(13,"xiaobin");
			
			Student student3 = new Student(14,"frank");
			
			Student student4 = new Student(12,"icexu");
			
			set.add(student1);
			set.add(student2);
			set.add(student3);
			set.add(student4);*/
			
/*//			Person person1 = new Person(12,"allan",12);
//			
//			Person person2 = new Person(12,"frank",22);
//			
//			Person person3 = new Person(12,"allan",23);
//			
//			Person person4 = new Person(12,"allan12",45);
 * 
*/			
			Users user1 = new Users(12,"allan");
			
			Users user2 = new Users(13,"alland");
			
			Users user3 = new Users(14,"allane");
			
			Users user4 = new Users(12,"allan");
			
			set.add(user1);
			set.add(user2);
			set.add(user3);
			set.add(user4);
			/*set.add(person1);
			set.add(person4);
			set.add(person2);
			set.add(person3);*/
			/*set.add(1);
			set.add(2);
			set.add(3);
			set.add(4);
			set.add(2);*/
	
			
			Iterator it = set.iterator();
			
			while(it.hasNext()){
				
				System.out.println(it.next());
			}
			System.out.println("==================");
			for (Object object : set) {
				
				System.out.println(object);
			}
			

	}

}
