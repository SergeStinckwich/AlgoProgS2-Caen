public class Car extends Vehicle{

	private double power;

	public String getCategory(){return "Car";}
	public double getMaximumSpeed(){return 1.5*power;}

	public Car(String name, double power){
		super(name);
		this.power = power;
	}
}