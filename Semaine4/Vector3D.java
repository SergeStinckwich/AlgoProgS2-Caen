class Vector3D {

private double x;
private double y;
private double z;

public Vector3D(double xInit, double yInit, double zInit){
	this.x = xInit;
	this.y = yInit;
	this.z = zInit;
}

public Vector3D(Vector3D v){
	this.x = v.x;
	this.y = v.y;
	this.z = v.z;
}

public boolean equals(Vector3D v){
	return (this.x == v.x)&&(this.y == v.y)&&(this.z == v.z);
}

public Vector3D copy(){
	return new Vector3D(this.x, this.y, this.z);
}

public static double scalarProduct(Vector3D v1, Vector3D v2){
		return v1.x*v2.x+v1.y*v2.y+v1.z*v2.z;
}

public double scalarProduct(Vector3D v){
		return Vector3D.scalarProduct(this, v);
	}

public static Vector3D crossProduct(Vector3D v1, Vector3D v2){
	return new Vector3D(v1.y*v2.z - v1.z*v2.y,
						v1.z*v2.x - v1.x*v2.z,
						v1.x*v2.y - v1.y*v2.x);
}

public Vector3D crossProduct(Vector3D v){
	return Vector3D.crossProduct(this, v);
}

public static Vector3D sum(Vector3D v1, Vector3D v2){
	return new Vector3D(v1.x + v2.x,
						v1.y + v2.y,
						v1.z + v2.z);
}

public Vector3D sum(Vector3D v){
	return Vector3D.sum(this, v);
}

public String toString(){
	return "Vector3D("	+this.x+", "
						+this.y+", "
						+this.z
					+")";
}

public static void main(String args[]){
	Vector3D v1 	= new Vector3D(1.0, 1.0, 1.0);
	Vector3D v2 	= new Vector3D(2.0, 2.0, 2.0);
	Vector3D v3  	= new Vector3D(v1);
	Vector3D zero 	= new Vector3D(0.0, 0.0, 0.0);
	Vector3D result = new Vector3D(3.0, 3.0, 3.0);

	System.out.println(v1.scalarProduct(v2) == 6.0);
	System.out.println(Vector3D.scalarProduct(v1,v2) == 6.0);

	System.out.println((v1.sum(v2)).scalarProduct(v1) == 9.0);
	System.out.println(Vector3D.scalarProduct(Vector3D.sum(v1, v2),v1) == 9.0);

	System.out.println(v1.crossProduct(zero).toString().equals("Vector3D(0.0, 0.0, 0.0)"));
	System.out.println(Vector3D.crossProduct(v1,zero).toString().equals("Vector3D(0.0, 0.0, 0.0)"));

	System.out.println(v1.copy().equals(v1) == true);
	System.out.println((v1==v3) == false);
	System.out.println(v1.equals(v3) == true);
	}
}