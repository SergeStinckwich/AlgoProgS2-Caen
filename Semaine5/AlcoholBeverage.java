public class AlcoholBeverage extends Beverage {

	double alcoholRate;

	public double getAlcoholRate(){return alcoholRate;}

	public AlcoholBeverage(String name, double price, double alcoholRate){
		super(name, price);
		this.alcoholRate = alcoholRate;
	}

	public String toString(){
		return "AlcoholBeverage(name="
				+this.getName()
				+", price="
				+this.getPrice()
				+", alcoholRate="
				+this.getAlcoholRate()
				+")";
	}
}