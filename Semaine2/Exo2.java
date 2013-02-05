class Exo2 {
	public static float racineCarre(float x, float epsilon){
		float borneInf = 0;
		float borneSup = x;
		float milieu = (borneSup+borneInf)/2;

		while (Math.abs(milieu*milieu-x)> epsilon){
			System.out.println("Borne Inf=" + borneInf+
							" " + "BorneSup=" + borneSup);
			milieu = (borneInf+borneSup)/2;
			if (milieu*milieu < x)
				borneInf = milieu;
			else
				borneSup = milieu;
		}
		return milieu;
	}

public static float racineCarreRecursive(float x, float borneInf, float borneSup,
									float epsilon){

	System.out.println("racineCarreRecursive(" + x + "," + borneInf + "," + 
						borneSup + "," + epsilon + ")");
	float milieu = (borneInf+borneSup)/2;
	if (Math.abs(milieu*milieu-x) < epsilon) return milieu;
		else
			if (milieu*milieu < x)
				return racineCarreRecursive(x, milieu, borneSup, epsilon);
			else
				return racineCarreRecursive(x, borneInf, milieu, epsilon);
}

	public static void main(String args[]){

		System.out.println(racineCarre(5, 0.0001F));
		System.out.println(racineCarre(15, 0.0001F));

		System.out.println(racineCarreRecursive(5, 0, 5, 0.00001F));
		System.out.println(racineCarreRecursive(15, 0, 15, 0.00001F));


	}

}