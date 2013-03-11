public class Beverage {
	private String name;
	private double price;

	public double getPrice(){return price;}

	public String getName(){return name;}

	public String toString(){
		return "Beverage(name="+this.getName()+", price="+this.getPrice()+")";
	}

	public Beverage(String name, double price){
		this.name = name; this.price = price;
	}

	public static void main (String [] args){
		Beverage orangeJuice = new Beverage("Orange juice", 3.0);
		AlcoholBeverage porto = new AlcoholBeverage ("Porto", 9.5, 18.0);
		Beverage water = new Beverage("Mineral water", 1.0);
		AlcoholBeverage whisky = new AlcoholBeverage("whisky", 7.4, 45.0);

		Beverage beverages[] = new Beverage[4];
		beverages[0] = orangeJuice;
		beverages[1] = porto;
		beverages[2] = water;
		beverages[3] = whisky;
		for (int i = 0; i <= 3;i++)
			System.out.println(beverages[i]);
	}
}