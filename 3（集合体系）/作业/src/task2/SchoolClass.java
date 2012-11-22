package task2;

import java.util.HashSet;

public class SchoolClass {

	private String id;
	
	private HashSet studentset=new HashSet() ;

	public HashSet getStudentset() {
		return studentset;
	}

	public void setStudentset(HashSet studentset) {
		this.studentset = studentset;
	}

	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    public SchoolClass() {
		
	}
    public SchoolClass(String id , Student stu) {
    	
    	super();
		this.id = id;
		addStudent(stu);
	}
	public SchoolClass(String id, HashSet studentset) {
		super();
		this.id = id;
		this.studentset = studentset;
	}

	public void addStudent(Student stu)
	{
		studentset.add(stu);
	}
	
	
	
}
