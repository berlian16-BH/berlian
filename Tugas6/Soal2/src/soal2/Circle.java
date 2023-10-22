package soal2;

public class Circle extends Shape{
	private double radius;

	public Circle() {
		super();
		this.radius = 1.0;
	}
	
	public Circle(double Radius) {
		super();
		this.radius = Radius;
	}
	
	public Circle(double Radius, String Color, boolean Filled) {
		super(Color,Filled);
		this.radius = Radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		 return radius*radius*Math.PI;
	 }
	
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
}