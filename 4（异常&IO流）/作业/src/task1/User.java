package task1;

import java.io.Serializable;


public class User implements Serializable{

	private int id;
	
	private static final long serialVersionUID = 2342342341L;
	
	private String name;

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
	
	public User() {
		
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		
		return "["+id+","+name+"]";
	}
	}
	

