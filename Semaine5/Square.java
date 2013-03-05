class Square extends Figure {

private float width; 	

public float getWidth(){return width;}
public void setWidth(float width){this.width = width;}

public float surface(){return this.getWidth()*this.getWidth();}

public Square(float x, float y, float width){
	super(x,y);
	this.width = width;
}

public String toString(){
	return "Square("+this.getX()+", "+this.getY()+", "+this.width+")";
}

public static void main(String args[])
{
	Square square1 = new Square(1,2,4);
	System.out.println(square1);
	System.out.println("Surface = "+square1.surface());
}
}