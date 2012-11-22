package task1;

public class Circle extends Shape{
	
	/* 半径  */
	private double radius;
	
	/* 取半径 */
	public double getRadius() {
		return radius;
	}
	
	/* 设置半径 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/* 求取圆形的周长的方法 */
	public double perimeter()
	{
		double values=2*3.14*radius;
		return values ;
	}
	
	/* 求取圆形的面积的方法  */
	public double area()
	{
		double values=3.14*radius*radius;
		return values ;
	}
	
	/* 圆形类的无参构造函数 */
	public Circle() {}
	
	/* 圆形类的有参构造函数 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

}
