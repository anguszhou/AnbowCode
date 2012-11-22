package task2;

public class TeskEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=4;
		
		/* 初始化测试数据 */	
        Employee []tesk=new Employee[4];
        
        tesk[0]=new SalariedEmployee("wangpeng",3,50000);
        
        tesk[1]=new HourlyEmployee("dongzheng",5,120,250);
        
        tesk[2]=new SalesEmployee("yelei",7,750000,0.125);
        
        tesk[3]=new BasePlusSalesEmployee("huihui",9,78000,0.0875,2100);
        
        System.out.println("当前是："+month+"月");
        
        for(int i=0;i<tesk.length;i++)
        {
        	
           System.out.println("员工姓名是："+tesk[i].getName());
     	   
     	   System.out.println("本月工资是："+tesk[i].getSalary(9));
        }
	}

}
