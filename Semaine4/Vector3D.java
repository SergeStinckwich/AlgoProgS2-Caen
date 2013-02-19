class Vector3D {

private double x;
private double y;
private double z;

public Vector3D(double xInit, double yInit, double zInit){
	x = xInit; y = yInit; z = zInit;}

public double scalarProduct(Vector3D v){
	return this.x*v.x+this.y*v.y+this.z*v.z;
	}

public Vector3D vectorialProduct(Vector3D v){
	return new Vector3D(this.y*v.z - this.z*v.y,
					this.z*v.x - this.x*v.z,
					this.x*v.y - this.y*v.x);
}
public Vector3D sumVector(Vector3D v){
	return new Vector3D(this.x + v.x,
						this.y + v.y,
						this.z + v.z);
	}

public String toString(){
	return "Vector3D("+(new Double(x)).toString()+","
				+(new Double(y)).toString()+","
				+(new Double(z)).toString()
				+")";
}

public static void main(String args[]){
	Vector3D v1 	= new Vector3D(1, 1, 1);
	Vector3D v2 	= new Vector3D(2, 2, 2);
	Vector3D zero 	= new Vector3D(0, 0, 0);
	Vector3D result = new Vector3D(3, 3, 3);

	System.out.println(v1.scalarProduct(v2) == 6);
	System.out.println((v1.sumVector(v2)).scalarProduct(v1) == 9);
	System.out.println(v1.vectorialProduct(zero));
	System.out.println(v1.vectorialProduct(zero).equals("Vector3D(0.0,0.0,0.0)"));
	}
}