public class Villa extends Building {

	private int rooms;
	private boolean hasSwimmingPool;

	private static final double taxesPerRoom = 100.0;
	private static final double taxesForSwimmingPool = 500.0;

	public boolean hasSwimmingPool() {return hasSwimmingPool;}

	public double computeTaxes(){
		return rooms*taxesPerRoom+(hasSwimmingPool?taxesForSwimmingPool:0);
	}

	public Villa(String owner, double surface, String address, int rooms, boolean hasSwimmingPool){
		super(owner, surface, address);
		this.rooms = rooms;
		this.hasSwimmingPool = hasSwimmingPool;
	}
}