package task1;

public class Rect extends Shape{
	
	/* 矩形的长 */
	private double length ;
	
	/* 矩形的宽 */
	private double wide;
	
	/* 取长度 */
	public double getLength() {
		return length;
	}
	
	/* 设置长度 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/* 取宽 */
	public double getWide() {
		return wide;
	}
	
	/* 设置宽 */
	public void setWide(double wide) {
		this.wide = wide;
	}
	
	/* 求取矩形的周长的方法 */
	public double perimeter()
	{
		double values=2*(length+wide);
		return values ;
	}
	
	/* 求取矩形的面积的方法  */
	public double area()
	{
		double values=length*wide;
		return values ;
	}
	
	/* 矩形类的无参构造函数 */
	public Rect() {}
		
	/* 矩形类的有参构造函数 */
	public Rect(double length, double wide) {
		super();
		this.length = length;
		this.wide = wide;
	}

}
