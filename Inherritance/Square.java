public class Square extends Rectangle{
	public Square(){
		this(1.0);
	}

	public Square(double side){
		super(side, side);
	}

	public Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}

	public double getSide(){
		return super.getWidth();
	}

	public void setSide(double side){
		setLength(side);
		setWidth(side);
	}

	public void setLength(double side){
		super.setLength(side);
	}

	public void setWidth(double side){
		super.setWidth(side);
	}

	public String toString(){
		String s =  String.format("A square with side = %.2f, which is a subclass of %s", getSide(), super.toString());
		return s;
	}


}