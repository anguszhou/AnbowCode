package task2;

public class TeskEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=4;
		
		/* ��ʼ���������� */	
        Employee []tesk=new Employee[4];
        
        tesk[0]=new SalariedEmployee("wangpeng",3,50000);
        
        tesk[1]=new HourlyEmployee("dongzheng",5,120,250);
        
        tesk[2]=new SalesEmployee("yelei",7,750000,0.125);
        
        tesk[3]=new BasePlusSalesEmployee("huihui",9,78000,0.0875,2100);
        
        System.out.println("��ǰ�ǣ�"+month+"��");
        
        for(int i=0;i<tesk.length;i++)
        {
        	
           System.out.println("Ա�������ǣ�"+tesk[i].getName());
     	   
     	   System.out.println("���¹����ǣ�"+tesk[i].getSalary(9));
        }
	}

}
