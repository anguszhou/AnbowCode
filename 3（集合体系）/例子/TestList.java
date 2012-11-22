package com.ambow.corejava.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
	
		public static void main(String[] args) {
			
			List list = new ArrayList();
			
			list.add(1);
			
			list.add(2);
			
			list.add(3);
			
			list.add(4);
			
			list.add(1);
			
		//打印集合
			//第一种
			for(int i=0 ;i<list.size();i++){
				
				System.out.println(list.get(i));
			}
			System.out.println("-=====================");
			//第二种
			Iterator it = list.iterator();
			while(it.hasNext()){
				
				System.out.println(it.next());
			}
			System.out.println("----------------------");
			//第三种 for each
			
			for (Object object : list) {
				
				System.out.println(object);
			}
			
		}

}






