package com.ambow.corejava.day4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutSterm {

		public static void main(String[] args) {
			
			FileOutputStream fis = null;
			try {
				
				fis = new FileOutputStream("d:\\in.txt");
				
				String str = "hello";
				
				byte [] by = str.getBytes();
				
				fis.write(by);
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}finally{
				
				if(fis != null)
					try {
						
						fis.close();
					
					} catch (IOException e) {
						
						e.printStackTrace();
					}
			}
		}
}

