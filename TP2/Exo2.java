class Exo2
{




	public static float racineCarreRecursive(float x,
							float borneInf, float borneSup, float epsilon){
		
		System.out.println("racineCarreRecursive("+x+","+borneInf+","+
							borneSup+","+epsilon+")");

		float milieu = (borneSup+borneInf)/2;
		if (Math.abs(milieu*milieu-x)<epsilon)
			return milieu;
		else 
			if (milieu*milieu < x)
				return racineCarreRecursive(x, milieu, borneSup, epsilon);
				else return racineCarreRecursive(x, borneInf, milieu, epsilon);
	}

	public static float racineCarre(float x) {
		float borneInf = 0.0F;
		float borneSup = x;
		float milieu = (borneSup+borneInf)/2;
		float epsilon = 0.001F; // Précision des calculs

		while (Math.abs(milieu*milieu-x)>epsilon) {
				milieu = (borneSup+borneInf)/2;
			if (milieu*milieu < x)
				borneInf = milieu;
				else borneSup = milieu;
		}
		return milieu;
	}

	public static void main(String args[]){

		System.out.println(racineCarre(5));
		System.out.println(racineCarreRecursive(5, 0, 5, 0.001F));	
	}

}