package task2;

public class Employee {

	/* 员工姓名 */
	private String name;
	
	/* 员工生日月份 */
	private int month;
	
	/* 无参构造函数 */	
    public Employee() {	}
	
    /* 有参构造函数 */	
    public Employee(String name, int month) {
		
		this.name = name;
		
		this.month = month;
	}

    /* 获取员工姓名 */	
	public String getName() {
		return name;
	}

	/* 设置员工姓名 */	
	public void setName(String name) {
		this.name = name;
	}

	/* 获取生日月份 */	
	public int getMonth() {
		return month;
	}

	/* 设置生日月份 */	
	public void setMonth(int month) {
		this.month = month;
	}


	/* 返回某月员工的工资 */ 
	public double getSalary(int month)
	{
		return 0;
	}
}
