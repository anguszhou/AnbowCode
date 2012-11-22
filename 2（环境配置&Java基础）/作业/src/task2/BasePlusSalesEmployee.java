package task2;

public class BasePlusSalesEmployee extends SalesEmployee{

	/* 底薪 */
	private double basesalary;

	

	/* 获取底薪 */	
	public double getBasesalary() {
		return basesalary;
	}

	
	/* 获得某月工资 */	
	public double getSalary(int month)
	{
		if(super.getMonth()==month)
			
		return super.getMonthsale()*super.getRate()+basesalary+100;
		
		else return super.getMonthsale()*super.getRate()+basesalary;
	}

	/**
	 * @param basesalary
	 */
	/* 构造函数 */	
	public BasePlusSalesEmployee(String name, int month,double monthsale, double rate,double basesalary) {
		
		super(name,month, monthsale,rate);
		
		this.basesalary = basesalary;
	}

	

}
