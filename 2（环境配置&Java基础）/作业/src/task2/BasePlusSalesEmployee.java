package task2;

public class BasePlusSalesEmployee extends SalesEmployee{

	/* ��н */
	private double basesalary;

	

	/* ��ȡ��н */	
	public double getBasesalary() {
		return basesalary;
	}

	
	/* ���ĳ�¹��� */	
	public double getSalary(int month)
	{
		if(super.getMonth()==month)
			
		return super.getMonthsale()*super.getRate()+basesalary+100;
		
		else return super.getMonthsale()*super.getRate()+basesalary;
	}

	/**
	 * @param basesalary
	 */
	/* ���캯�� */	
	public BasePlusSalesEmployee(String name, int month,double monthsale, double rate,double basesalary) {
		
		super(name,month, monthsale,rate);
		
		this.basesalary = basesalary;
	}

	

}
