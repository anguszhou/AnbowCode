package task2;

public class SalariedEmployee extends Employee{
	
	/* 月薪 */
	private double monthsalary;
	
	/**
	 * @param name
	 * @param month
	 * @param monthsalary
	 */
    public SalariedEmployee() {	}
	
    /* 构造函数 */	
	public SalariedEmployee(String name, int month, double monthsalary) {
		
		super(name, month);
		
		this.monthsalary = monthsalary;
	}

	/* 返回某月员工的工资 */ 
	public double getSalary(int month)
	{
		if(super.getMonth()==month)
			
		return monthsalary+100;
		
		else return monthsalary;
	}

}