package com.ambow.corejava.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InputStream in = null;
		
		InputStreamReader inr = null;
		
		BufferedReader buffr = null;
		/*
		OutputStream out = null;
		
		BufferedWriter buff = null;
		
		OutputStreamWriter outsw = null;
		
		
		
		try{
			
			out = new FileOutputStream("d:\\buff.txt");
			
			outsw = new OutputStreamWriter(out);
			
			buff = new BufferedWriter(outsw);
			
			String str = "我在昆山";
			
			buff.write(str);
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally{
			
			try {
				if (buff != null)
					buff.close();
				if (outsw != null)
					outsw.close();
				if (out != null)
					out.close();
			} catch (Exception e2) {
			
			}
			
		}
		
		*/
	try{
			
		//	in = new FileInputStream("d:\\buff.txt");
			
			in = new FileInputStream("d:\\buf.txt");
			//指定读文件的编码格式
			inr = new InputStreamReader(in,"GBK");
			
			buffr = new BufferedReader(inr);
			
			String str;
			
			while((str = buffr.readLine()) != null){
				
				System.out.println(str);
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally{
			
			try {
				if (buffr != null)
					buffr.close();
				if (inr != null)
					inr.close();
				if (in != null)
					in.close();
			} catch (Exception e2) {
			
			}
			
		}
		
	}

}
