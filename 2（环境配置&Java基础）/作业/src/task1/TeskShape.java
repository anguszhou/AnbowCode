package task1;

public class TeskShape {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* ��ʼ������  */	
       Shape []tesk=new Shape[3];
       
       tesk[0]=new Shape();
       
       tesk[1]=new Rect(12.2,7.8);
       
       tesk[2]=new Circle(8.3);
       
       for(int i=0;i<tesk.length;i++)
       {
    	   int j=i+1;
    	   
    	   System.out.println("��"+j+"ͼ������ǣ�"+tesk[i].area());
    	   
    	   System.out.println("           �ܳ��ǣ�"+tesk[i].perimeter());
       }
       
	}

}
