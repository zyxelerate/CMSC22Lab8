public class Shape{
	private String color;
	private boolean filled;

	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public Shape(){
		this("red", true);
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public boolean isFilled(){
		return filled;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public String toString(){
		String s =  "";
		String u = String.format("A Shape with color of %s and ", color); 
		if (filled) {
			s = "filled";
		}
		else
			s = "not filled";

		return u + s;
	}
}