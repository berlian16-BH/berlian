package soal2;

public class Square extends Rectangle{
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side,side);
	}
	
	public Square(double side, String Color, boolean filled) {
		super(side,side,Color,filled);
	}
	
	public void getSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}

	@Override
	public void setLength(double Side) {
		getSide(Side);
	}
	
	public void setWidth(double Side) {
		getSide(Side);
	}
	
	public String toString() {
		return "Square[Shape[Color = "+ this.getColor() +", Filled "+ this.isFilled()
		+", Width "+ super.getWidth() +", Length "+ this.getLength()+"]";
	}
}
