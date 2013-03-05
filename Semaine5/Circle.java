class Circle extends Figure {

private float radius;

public float getRadius(){return radius;}
public void setRadius(float radius){this.radius = radius;}

public float surface(){return (float)Math.PI*this.getRadius()*this.getRadius();}

public Circle(float x, float y, float radius){
	super(x,y);
	this.radius = radius;
}

public String toString(){
	return "Circle("+this.getX()+", "+this.getY()+", "+this.getRadius()+")";
}

public static void main(String args[])
{
	Circle circle1 = new Circle(1,2,4);
	System.out.println(circle1);
	System.out.println("Surface = "+circle1.surface());
}
}