package kasus2;

public abstract class shape {
	private String shapeName;
	
	public shape(String shapename) {
		this.shapeName = shapename;
	}
	
	public abstract double area();
	public String toString() {
		String Result = "Shape Name " + this.shapeName;
		return Result;
	}
	
}