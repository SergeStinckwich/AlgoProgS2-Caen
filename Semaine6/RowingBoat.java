public class RowingBoat extends Vehicle{

	private int numberOfRowers;

	public String getCategory(){return "Boat";}
	public double getMaximumSpeed(){return 0.5*numberOfRowers;}

	public RowingBoat(String name, int numberOfRowers){
		super(name);
		this.numberOfRowers = numberOfRowers;
	}
}