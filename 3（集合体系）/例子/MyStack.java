package com.ambow.corejava.day3;
import java.util.LinkedList;
public class MyStack {
		
	private LinkedList list = new LinkedList();
	
	public Object pop(){
			
		return list.removeFirst();
	}
	
	public void push(Object o){
		
		list.addFirst(o);
	}
	
	public static void main(String[] args) {
		
		MyStack myStack = new MyStack();
		
		myStack.push(1);
		
		myStack.push(2);
		
		myStack.push(3);
		
		myStack.push(4);
		
		System.out.println(myStack.pop());
		
		
	}
}






