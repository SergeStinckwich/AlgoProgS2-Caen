class Exo7 {
	
	public static String asString(int m[][]){
		String result = "";
		result = result + "{";
		for (int i=0; i<m.length; i++)
		{
			result = result + "{";
			for (int j= 0; j < m[0].length; j++){
				result = result + (new Integer(m[i][j])).toString();
				if (j != m[0].length-1) result = result + ",";
			}
			result = result + "}";
			if (i != m.length-1) result = result + ",";
		}
		result = result + "}";
	return result;
	}

	public static int [][] sum(int a[][], int b[][]){
		int [][] result = new int [a.length][a[0].length];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				result[i][j] = a[i][j]+b[i][j];
			return result;
	}

	public static int [][] product(int a[][], int b[][]){
		int [][] result = new int[a.length][a[0].length];
		for (int i = 0; i< a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				for (int k = 0; k < a.length; k++)
					result[i][j] = result[i][j]+ a[i][k]*b[k][j];
		return result;
	}

	public static void testMatrices(){
		int a[][] = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		int b[][] = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		System.out.println(asString(a).equals(
				"{{1,1,1},{1,1,1},{1,1,1}}"));
		System.out.println(asString(sum(a,b)).equals(
				"{{2,2,2},{2,2,2},{2,2,2}}")); 
		System.out.println(asString(product(a,b)).equals(
				"{{3,3,3},{3,3,3},{3,3,3}}"));
	}

	public static void main(String[] args) {
		testMatrices();
	}
}