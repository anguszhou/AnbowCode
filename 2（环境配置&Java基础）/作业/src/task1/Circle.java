package task1;

public class Circle extends Shape{
	
	/* �뾶  */
	private double radius;
	
	/* ȡ�뾶 */
	public double getRadius() {
		return radius;
	}
	
	/* ���ð뾶 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/* ��ȡԲ�ε��ܳ��ķ��� */
	public double perimeter()
	{
		double values=2*3.14*radius;
		return values ;
	}
	
	/* ��ȡԲ�ε�����ķ���  */
	public double area()
	{
		double values=3.14*radius*radius;
		return values ;
	}
	
	/* Բ������޲ι��캯�� */
	public Circle() {}
	
	/* Բ������вι��캯�� */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

}
