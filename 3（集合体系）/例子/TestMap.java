package com.ambow.corejava.day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map map = new HashMap();
		
		map.put(1, "allan");
		
		map.put(2, "icexu");
		
		map.put(3, "frank");
		
		map.put(4, "jimmy");
		//第一种方式
		//1：迭代key
		
		Set set = map.keySet();
		
		//2:迭代key的集合
		
		Iterator  it = set.iterator();
		
		while(it.hasNext()){
			
			Object key = it.next();
			
			System.out.println(key);
			
			System.out.println(map.get(key));
		}
		
		System.out.println("=========第二种方式==========");
		//第二种方式
		
		Set set1 = map.entrySet();
		
		Iterator it1 = set1.iterator();
		
		while(it1.hasNext()){
			
			Entry entry = (Entry)it1.next();
			
			System.out.println("key="+entry.getKey());
			
			System.out.println("value="+entry.getValue());
		}
	}

}








