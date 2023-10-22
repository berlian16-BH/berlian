package kasus2;

public class Paint {
	private double coverage ;
	public Paint(double c) {
		this.coverage = c;
	}
	
	public double amount(shape s) {
		System.out.println("Computing amount for " + s);
		return s.area();
	}
}