package task2;

public class Course {
	
	/**
	 * 1��	����һ��Course�࣬����γ�
	 * ������һ��Student�࣬����ѧ����
	 * ��Student���а���һ��������һ��HashSet�Ķ���
	 * �����洢��ѧ����ѡ�����пγ̣����ṩ��Ӧ��addCourse(Course c)������
	 * ��ʾ���һ��ѡ��
    
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
