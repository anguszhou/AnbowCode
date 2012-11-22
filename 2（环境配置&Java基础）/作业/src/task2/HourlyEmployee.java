package task2;

public class HourlyEmployee extends Employee{

	/* 每小时工资 */
	private double hoursalary;
	
	/* 某月工作小时数  */
	private int hours;
	
	
	/**
	 * @param name
	 * @param month
	 * @param hoursalary
	 * @param hours
	 */
    public HourlyEmployee() {}
	
    /* 构造函数 */	
	public HourlyEmployee(String name, int month, double hoursalary, int hours) {
		
		super(name, month);
		
		this.hoursalary = hoursalary;
		
		this.hours = hours;
	}

	/* 获取每小时工资 */	
	public double getHoursalary() {
		return hoursalary;
	}

	/* 获取某月工作小时 */	
	public int getHours() {
		return hours;
	}

	/* 获取员工某月工资 */	
	public double getSalary(int month)
	{
		if(super.getMonth()==month)
		{
			/* 该员工该月工作时间超过160个小时且该月是其生日  */
			 if(hours>160)
		       return (hours-160)*hoursalary*1.5+160*hoursalary+100;
			 
			 /* 该员工该月工作时间没有超过160个小时且该月是其生日  */
			 else return hours*hoursalary+100;
		}
		else {
			/* 该员工该月工作时间超过160个小时且该月不是其生日  */
			 if(hours>160)
			       return (hours-160)*hoursalary*1.5+160*hoursalary;
			 
			 /* 该员工该月工作时间没有超过160个小时且该月不是其生日  */	 
			 else return hours*hoursalary;
			}
	}
}
