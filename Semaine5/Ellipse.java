public class Ellipse extends Circle {

private float radius2;

public float getRadius2(){return radius2;}
public void setRadius2(float radius2){this.radius2 = radius2;}

public float surface(){return (float)Math.PI*this.getRadius()*this.getRadius2();}

public Ellipse(float x, float y, float radius, float radius2){
	super(x, y, radius);
	this.radius2 = radius2;
}

public String toString(){
	return "Ellipse("+this.getX()+", "+this.getY()+", "+this.getRadius()+", "
		+ this.getRadius2()+")";
}

public static void main(String args[])
{
	Ellipse ellipse1 = new Ellipse(1,2,4,7);
	System.out.println(ellipse1);
	System.out.println("Surface = "+ellipse1.surface());
}
}