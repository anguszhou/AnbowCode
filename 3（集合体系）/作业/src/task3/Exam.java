package task3;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exam {
	
	private HashSet<Student> studentset=new HashSet<Student>();
	
	private Paper pp;
	
	public Exam() {
		
	}

	public Exam(HashSet<Student> studentset, Paper pp) {
		super();
		this.studentset = studentset;
		this.pp = pp;
	}

	public HashSet<Student> getStudentset() {
		return studentset;
	}

	public void setStudentset(HashSet<Student> studentset) {
		this.studentset = studentset;
	}

	public Paper getPp() {
		return pp;
	}

	public void setPp(Paper pp) {
		this.pp = pp;
	}

	/* 判卷 */
	public void Check(Exam ex)
	{
		double []score=new double[5];
		
		/*为每位学生添加成绩；*/
		
		Iterator<Student> its= ex.getStudentset().iterator();
		
		while(its.hasNext())
		{
			Student stu=its.next();
			
		    Set<String> set=stu.getPp().getQstset().keySet();
		    
			Iterator<String> ita=set.iterator();
						
			while(ita.hasNext())
			{
				Object key=ita.next();
				
				if(stu.getAsr().getAsrset().get(key)==
					stu.getPp().getQstset().get(key).getAsr())
					
				    stu.setSorce(stu.getSorce()+20);
			}					  
		}
				
		/*对本场考试学生成绩排序；*/
		
			Iterator<Student> it = ex.getStudentset().iterator();
			
			TreeSet<Student> ts = new TreeSet<Student>();
			
			while(it.hasNext()){
				
				ts.add(it.next());
			}
								
			Iterator<Student> itp = ts.iterator();
			
			int i=1;
			
			while(itp.hasNext())
			{								
				Student student=itp.next();
				
				System.out.println("名次："+i+"--"+"姓名："+student.getName()
						+"--"+"成绩："+student.getSorce());
				
				i+=1;
			}
		
	}				
}
