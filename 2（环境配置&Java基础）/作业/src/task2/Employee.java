package task2;

public class Employee {

	/* Ա������ */
	private String name;
	
	/* Ա�������·� */
	private int month;
	
	/* �޲ι��캯�� */	
    public Employee() {	}
	
    /* �вι��캯�� */	
    public Employee(String name, int month) {
		
		this.name = name;
		
		this.month = month;
	}

    /* ��ȡԱ������ */	
	public String getName() {
		return name;
	}

	/* ����Ա������ */	
	public void setName(String name) {
		this.name = name;
	}

	/* ��ȡ�����·� */	
	public int getMonth() {
		return month;
	}

	/* ���������·� */	
	public void setMonth(int month) {
		this.month = month;
	}


	/* ����ĳ��Ա���Ĺ��� */ 
	public double getSalary(int month)
	{
		return 0;
	}
}
