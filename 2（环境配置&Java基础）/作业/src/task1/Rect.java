package task1;

public class Rect extends Shape{
	
	/* ���εĳ� */
	private double length ;
	
	/* ���εĿ� */
	private double wide;
	
	/* ȡ���� */
	public double getLength() {
		return length;
	}
	
	/* ���ó��� */
	public void setLength(double length) {
		this.length = length;
	}
	
	/* ȡ�� */
	public double getWide() {
		return wide;
	}
	
	/* ���ÿ� */
	public void setWide(double wide) {
		this.wide = wide;
	}
	
	/* ��ȡ���ε��ܳ��ķ��� */
	public double perimeter()
	{
		double values=2*(length+wide);
		return values ;
	}
	
	/* ��ȡ���ε�����ķ���  */
	public double area()
	{
		double values=length*wide;
		return values ;
	}
	
	/* ��������޲ι��캯�� */
	public Rect() {}
		
	/* ��������вι��캯�� */
	public Rect(double length, double wide) {
		super();
		this.length = length;
		this.wide = wide;
	}

}
