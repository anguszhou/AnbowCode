package task1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class TestTeacher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			// TODO Auto-generated method stub

			Set test=new TreeSet();
			
			Teacher tea1=new Teacher ("zhang",21,3500);
			
			Teacher tea2=new Teacher ("li",21,3500);
			
			Teacher tea3=new Teacher ("wang",21,5500);
			
			Teacher tea4=new Teacher ("zhou",19,3500);
			
			Teacher tea5=new Teacher ("zhao",20,3600);
			
			test.add(tea1);
			test.add(tea2);
			test.add(tea3);
			test.add(tea4);
			test.add(tea5);
			
			Iterator it = test.iterator();
		    
		    while(it.hasNext()){
				
				System.out.println(it.next());
			}
			
			
		}
	}


