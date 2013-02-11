class Point  {

private int x;
private int y;

public int getX(){ return x;}

public int getY(){ return y;}

public void setX(int a){ x = a;}

public void setY(int b){ y = b;}

public Point(){ x = 0; y = 0;}
public Point(int a, int b){ x = a; y = b;}

public static void main(String[] args) {
	Point p = new Point();
	System.out.println(p.x);
	Point z = new Point(3,4);
	System.out.println(z.x);
	System.out.println(z.getX());
	z.setX(0);
	System.out.println(z.getX());
}
}
