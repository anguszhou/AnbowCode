package com.ambow.corejava.day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream {

		public static void main(String[] args) {
			
			FileInputStream fos = null;
			try {
				
				fos = new FileInputStream("d:\\in.txt");
				
				byte [] by = new byte[1024];
				
				int len;
				
				while((len=fos.read(by)) != -1){
					
					for( int i = 0;i<=len;i++){
						
						System.out.println((char)by[i]);
					}
					
				}
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}finally{
				
				if(fos != null)
					try {
						
						fos.close();
					
					} catch (IOException e) {
						
						e.printStackTrace();
					}
			}
		}
}

