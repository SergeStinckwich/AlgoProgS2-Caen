class Point  {

	private int x;
	private int y;

public Point(){
	x = 0;
	y = 0;
}

public Point(int u, int v){
	x = u;
	y = v;
}

public int getX(){
	return x;
}

public int getY(){
	return y;
}

public static void main(String[] args) {
	Point p1 = new Point();	
	Point p2 = new Point(2,3);
	System.out.println(p1.getX());
}

}