class Matrice {
	
	private double m [][];
	private int width;
	private int height;

	public Matrice(double m[][]){
		this.m = m;
		this.width = m.length;
		this.height = m[0].length;
	}

	public Matrice(int width, int height){
		m = new double [width][height];
		this.width = width;
		this.height = height;
	}

	public String toString(){
		String result = "";
		result = result + "{";
		for (int i=0; i<width; i++)
		{
			result = result + "{";
			for (int j= 0; j < height; j++){
				result = result + (new Double(m[i][j])).toString();
				if (j != height-1) result = result + ", ";
			}
			result = result + "}";
			if (i != width-1) result = result + ", ";
		}
		result = result + "}";
	return result;
	}

	public Matrice sum(Matrice a){
		Matrice result = new Matrice(a.width, a.height);
		for (int i = 0; i < a.width; i++)
			for (int j = 0; j < a.height; j++)
				result.m[i][j] = this.m[i][j]+a.m[i][j];
			return result;
	}

	public Matrice product(Matrice a){
		Matrice result = new Matrice(a.width, a.height);
		for (int i = 0; i< a.width; i++)
			for (int j = 0; j < a.height; j++)
				for (int k = 0; k < a.width; k++)
					result.m[i][j] = result.m[i][j]+ this.m[i][k]*a.m[k][j];
		return result;
	}

	public void setAsZeroedMatrice()
	{
		for (int i=0; i<width; i++)
			for (int j = 0; j < height; j++)
				m[i][j] = 0;
	}

	public void setAsUnityMatrice()
	{
		for (int i=0; i<width; i++)
			for (int j = 0; j < height; j++)
				if (i==j) m[i][j] = 1;
						else m[i][j] =0;
	}

	public static void main(String args[]){
		double m[][] = {{1.0, 1.0, 1.0},
						{1.0, 1.0, 1.0},
						{1.0, 1.0, 1.0}};
		Matrice a = new Matrice(m);
		Matrice b = new Matrice(m);
		Matrice zero = new Matrice(3, 3);
		zero.setAsZeroedMatrice();
		Matrice unity = new Matrice(3, 3);
		unity.setAsUnityMatrice();

		System.out.println(a.toString().equals(
				"{{1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}}"));
		System.out.println(zero.toString().equals(
			"{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}}"));

		System.out.println(a.sum(b).toString().equals(
		 		"{{2.0, 2.0, 2.0}, {2.0, 2.0, 2.0}, {2.0, 2.0, 2.0}}")); 
		System.out.println(a.product(b).toString().equals(
		 		"{{3.0, 3.0, 3.0}, {3.0, 3.0, 3.0}, {3.0, 3.0, 3.0}}"));
	}
}