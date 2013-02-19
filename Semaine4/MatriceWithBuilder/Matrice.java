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

	public Matrice(Builder builder){
		this.m = builder.m;
		this.width = builder.width;
		this.height = builder.height;
		if (this.m == null)
			this.m = new double[this.width][this.height];

	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder{
			private double m [][];
			private int width;
			private int height;

		public Builder withValues(double m[][])
		{
			this.m = m;
			this.withWidth(m.length);
			this.withHeight(m[0].length);
			return this;
		}

		public Builder withWidth(int width){
			this.width = width;
			return this;
		}

		public Builder withHeight(int height){
			this.height = height;
			return this;
		}

		public Matrice build(){
			return new Matrice(this);
		}
	}

	public int width(){
		return width;
	}

	public int height(){
		return height;
	}

	public static Matrice fromArray(double m[][]){
		return Matrice.builder().withValues(m).build();
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
					result.m[i][j] = result.m[i][j]+this.m[i][k]*a.m[k][j];
		return result;
	}

	public static Matrice zeroedMatrice(int width, int height)
	{
		return Matrice.builder()
					  .withWidth(width)
					  .withHeight(height)
					  .build();
	}

	public static Matrice identityMatrice(int width, int height)
	{
		// Only works on square matrice (width == height)
		Matrice result = Matrice.builder()
						  		.withWidth(width)
						  		.withHeight(height)
						  		.build();
		for (int i=0; i<width; i++)
			result.m[i][i] = 1;
		return result;
	}


	public static void main(String args[]){
		double m[][] 	= {{1.0, 1.0, 1.0},
						   {1.0, 1.0, 1.0},
						   {1.0, 1.0, 1.0}};

		Matrice a 		= Matrice.fromArray(m);
		Matrice b 		= Matrice.fromArray(m);
		Matrice zero 	= Matrice.zeroedMatrice(3, 3);
		Matrice unity 	= Matrice.identityMatrice(3, 3);

		System.out.println(a.width() == 3);
		System.out.println(a.height() == 3);

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