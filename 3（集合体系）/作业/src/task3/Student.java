package task3;

public class Student implements Comparable{
    
	private int id;
	
	private String name;
	
	private Paper pp;
	
	private Answersheet asr ;
	
	private double sorce=0;
	
	public double getSorce() {
		return sorce;
	}

	public void setSorce(double sorce) {
		this.sorce = sorce;
	}

	public Student() {
		
	}

	public Student(int id, String name, Paper pp, Answersheet asr) {
		super();
		this.id = id;
		this.name = name;
		this.pp = pp;
		this.asr = asr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Paper getPp() {
		return pp;
	}

	public void setPp(Paper pp) {
		this.pp = pp;
	}

	public Answersheet getAsr() {
		return asr;
	}

	public void setAsr(Answersheet asr) {
		this.asr = asr;
	}
	
	public int compareTo(Object obj)
	{
		Student stu = (Student) obj ;
		
		if(stu.getSorce()>this.getSorce())  return 1;
		
		if(stu.getSorce()<this.getSorce())  return -1;
		
		else
			return this.name.compareTo(stu.name);
	}
	
}
