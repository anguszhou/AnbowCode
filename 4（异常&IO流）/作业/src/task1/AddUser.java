package task1;

import java.io.FileOutputStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AddUser {
	
	public static boolean Login(int id, String name)
	{
        InputStream in = null;
		
		ObjectInputStream objectin=null;
		
		String str = "["+String.valueOf(id)+","+name+"]";
		
		try
		{
			in=new FileInputStream("d:\\test.txt");
			
			objectin = new ObjectInputStream(in) ;
			
			try{
				while(true){
					
					if(objectin.readObject().toString().equals(str))	
					{
						System.out.println("³É¹¦µÇÂ¼£¡");
						
						return true ;
					}
										
				}
				
			}catch(EOFException e){
						
				System.out.println();
			}
		}
		catch (Exception e) {
			
			e.printStackTrace();
		} 
		finally
		{
			
			
				try {
					
					if(objectin != null)
				
					    objectin.close();
				
				    if(in != null)
				
				        in.close();
				  }
				catch (Exception e) {
					
					e.printStackTrace();
				} 
		} 
		
		System.out.println("µÇÂ¼Ê§°Ü£¡");
		
		return false ;
	}
	
	
	public static void main(String[] args) {
		
		User user1 =new User(1,"wang");
		
		User user2 =new User(2,"li");
		
		User user3 =new User(3,"zhou");
		
		User user4 =new User(4,"ye");
		
		User user5 =new User(5,"mao");
		
        OutputStream  out=null ;
		
		ObjectOutputStream objectout=null;
		
		try {
			    out = new FileOutputStream("d:\\test.txt");
									
		    	objectout=new ObjectOutputStream(out);
		    	
				objectout.writeObject(user1);
				
				objectout.writeObject(user2);
				
				objectout.writeObject(user3);
				
				objectout.writeObject(user4);
				
				objectout.writeObject(user5);
																	    			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		finally
		{
			
			
				try {
					
					if(objectout != null)
				
					    objectout.close();
				
				    if(out != null)
				
				        out.close();
				  }
				catch (Exception e) {
					
					e.printStackTrace();
				} 
		} 
		
		
		InputStream in = null;
		
		ObjectInputStream objectin=null;
		
		try
		{
			in=new FileInputStream("d:\\test.txt");
			
			objectin = new ObjectInputStream(in) ;
			
			try{
				while(true){
					
						System.out.println(objectin.readObject().toString());
					
				}
			}catch(EOFException e){
						
				System.out.println("ÎÄ¼þ¶Áµ½Ä©Î²£¡");
			}
		}
		catch (Exception e) {
			
			e.printStackTrace();
		} 
		finally
		{
			
			
				try {
					
					if(objectin != null)
				
					    objectin.close();
				
				    if(in != null)
				
				        in.close();
				  }
				catch (Exception e) {
					
					e.printStackTrace();
				} 
		} 
		
		String str="li";
		
		Boolean bool=Login(3, str);
		
	}
}
