package task2;

public class SalesEmployee extends Employee{

	/* �����۶� */
	private double monthsale;
	
	
	/* ����� */
	private double rate;

	/* ��ȡ�����۶� */	
	public double getMonthsale() {
		return monthsale;
	}

	/* ��ȡ����� */	
	public double getRate() {
		return rate;
	}


	/* ���캯�� */	
	public SalesEmployee() {}
	
	public SalesEmployee(String name, int month,double monthsale, double rate) {
		super(name, month);
		this.monthsale = monthsale;
		this.rate = rate;
	}
	
	/* ��ȡԱ��ĳ�¹��� */	
	public double getSalary(int month)
	{
		if(super.getMonth()==month)
			
		return monthsale*rate+100;
		
		else return monthsale*rate;
	}

}
