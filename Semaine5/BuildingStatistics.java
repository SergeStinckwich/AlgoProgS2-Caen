class BuildingStatistics  {
	
	public static double meanTaxes(Building buildings[]){
		int numberOfBuildings = buildings.length;
		double sum = 0.0;
		for (int i=0; i < numberOfBuildings-1; i++)
		sum = sum + buildings[i].computeTaxes();
		return sum/numberOfBuildings;
	}

	public static Building buildingWithHighestTaxes(Building buildings[]){
	int numberOfBuildings = buildings.length;
	double maxTaxes = 0.0;
	int buildingWithHighestTaxes = 0;
	for (int i=0; i < numberOfBuildings-1; i++)
		if (buildings[i].computeTaxes()>maxTaxes){
			buildingWithHighestTaxes = i;
			maxTaxes = buildings[i].computeTaxes();
		}
	return buildings[buildingWithHighestTaxes];
	}

public static void main(String[] args) {
		Building buildings[]= new Building[6];
		buildings[0]= new Villa("John", 1000, "XXX", 100, true);
		buildings[1]= new Villa("Mary", 2000, "YYY", 200, false);
		buildings[2]= new Factory("Bill", 250, "XXXX", "AAA", 10000, 100);
		buildings[3]= new Factory("Edgar", 500, "IIII", "BBB", 200, 10);
		buildings[4]= new Building("John", 2000, "RRR");
		buildings[5]= new Building("Bill", 3000, "ZZZ");

		System.out.println("Means of taxes = "+meanTaxes(buildings));
		System.out.println("Building with highest taxes="+buildingWithHighestTaxes(buildings));
	}

}