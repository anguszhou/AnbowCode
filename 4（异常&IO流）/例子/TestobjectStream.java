package com.ambow.corejava.day4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class TestobjectStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InputStream in = null;
		
		ObjectInputStream objectin = null;
		
	/*	ObjectOutputStream  objectout = null;
		
		OutputStream out = null;
		
		
		try{
		
			out = new FileOutputStream("d:\\student.dat");
			
			objectout = new ObjectOutputStream(out);
		
			Student student1 = new Student(44,"icexu");
			
			Student student2 = new Student(18,"allandou");
			
			Student student3 = new Student(55,"jimmy");
			
			objectout.writeObject(student1);
			
			objectout.writeObject(student2);
			
			objectout.writeObject(student3);
			
		}catch(Exception e){
				
				e.printStackTrace();

		}finally{
				
				try {
					if (objectout != null)
						objectout.close();
					if (out != null)
						out.close();
				} catch (Exception e2) {
					
					e2.printStackTrace();
				}
		}*/

		try{
			
			in = new FileInputStream("d:\\student.dat");
			
			objectin = new ObjectInputStream(in);
		try{
			while(true){
				
					System.out.println(objectin.readObject());
				
			}
		}catch(EOFException e){
					
			System.out.println("文件已读到末尾");
		}
				
				
		}catch(Exception e){
				
				e.printStackTrace();

		}finally{
				
				try {
					if (objectin != null)
						objectin.close();
					if (in != null)
						in.close();
				} catch (Exception e2) {
					
					e2.printStackTrace();
				}
		}
	}

}
