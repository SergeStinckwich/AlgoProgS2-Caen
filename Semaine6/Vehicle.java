public abstract class Vehicle{

	private String name;

	public abstract String getCategory();
	public abstract double getMaximumSpeed();

	public Vehicle(String name){
		this.name = name;
	}
}