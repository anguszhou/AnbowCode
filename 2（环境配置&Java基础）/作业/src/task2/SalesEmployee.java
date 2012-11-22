package task2;

public class SalesEmployee extends Employee{

	/* 月销售额 */
	private double monthsale;
	
	
	/* 提成率 */
	private double rate;

	/* 获取月销售额 */	
	public double getMonthsale() {
		return monthsale;
	}

	/* 获取提成率 */	
	public double getRate() {
		return rate;
	}


	/* 构造函数 */	
	public SalesEmployee() {}
	
	public SalesEmployee(String name, int month,double monthsale, double rate) {
		super(name, month);
		this.monthsale = monthsale;
		this.rate = rate;
	}
	
	/* 获取员工某月工资 */	
	public double getSalary(int month)
	{
		if(super.getMonth()==month)
			
		return monthsale*rate+100;
		
		else return monthsale*rate;
	}

}
