class Exo6 {
	
public static double scalarProduct(double v1[], double v2 []){
	
	return v1[0]*v2[0]+v1[1]*v2[1]+v1[2]*v2[2];
	}

public static double[] sumVector(double v1[], double v2[]){
	double result [] = {v1[0]+v2[0],
						v1[1]+v2[1],
						v1[2]+v2[2]};
	return result;
	}

public static void main(String[] args) {
	
	double v1 [] = {1, 1, 1};
	double v2 [] = {2, 2, 2};
	double result [] = {3, 3, 3};

	System.out.println(scalarProduct(v1, v2) == 6);
	System.out.println(scalarProduct(sumVector(v1, v2), v1) == 9);
}
}