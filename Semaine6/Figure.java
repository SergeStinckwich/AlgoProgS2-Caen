public abstract class Figure
{
	private String color;

	public Figure(String color){
		this.color = color;
	}

	public abstract double perimeter();
	public abstract double surface();
}