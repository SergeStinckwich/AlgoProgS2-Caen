public class Square extends Figure {
	
	private double width;

	public Square(String color){
		super(color);
	}

	public double perimeter(){
		return 4.0*width;
	}

	public double surface(){
		return width*width;
	}

}