package task2;

public class Course {
	
	/**
	 * 1，	定义一个Course类，代表课程
	 * ；定义一个Student类，代表学生，
	 * 在Student类中包含一个属性是一个HashSet的对象，
	 * 用来存储该学生所选的所有课程，并提供相应的addCourse(Course c)方法，
	 * 表示添加一门选课
    
	 */
	private int id;
    
	private String coursename;
	
	private String teachaername;

	public String getCourseName() {
		return coursename;
	}

	public void setCourseName(String coursename) {
		this.coursename = coursename;
	}

	public String getTeachaerName() {
		return teachaername;
	}

	public void setTeachaerName(String teachaername) {
		this.teachaername = teachaername;
	}

	public Course() {
		
	}

	public Course(int id, String coursename, String teachaername) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.teachaername = teachaername;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
