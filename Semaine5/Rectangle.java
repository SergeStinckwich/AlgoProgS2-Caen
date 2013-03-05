public class Rectangle extends Square {
	
	private float height;

	public Rectangle(float x, float y, float width, float height)
	{
		super(x, y, width);
		this.height = height;
	}

	public float getHeight(){return height;}

	public void setHeight(float height){this.height=height;}

	public String toString(){
		return "Rectangle("+this.getX()+", "+this.getY()+", "+this.getWidth()+", "+
			this.getHeight()+")";
	}

	public float surface(){
		return this.getWidth()*this.getHeight();
	}

	public static void main(String[] args){
		Rectangle rectangle1 = new Rectangle(1,2,4,5);
		System.out.println(rectangle1);
		System.out.println("Surface = "+rectangle1.surface());
	}
}