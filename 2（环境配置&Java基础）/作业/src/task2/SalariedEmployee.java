package task2;

public class SalariedEmployee extends Employee{
	
	/* ��н */
	private double monthsalary;
	
	/**
	 * @param name
	 * @param month
	 * @param monthsalary
	 */
    public SalariedEmployee() {	}
	
    /* ���캯�� */	
	public SalariedEmployee(String name, int month, double monthsalary) {
		
		super(name, month);
		
		this.monthsalary = monthsalary;
	}

	/* ����ĳ��Ա���Ĺ��� */ 
	public double getSalary(int month)
	{
		if(super.getMonth()==month)
			
		return monthsalary+100;
		
		else return monthsalary;
	}

}