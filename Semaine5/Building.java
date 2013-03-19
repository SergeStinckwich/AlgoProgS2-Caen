public class Building {
	private String owner;
	private double surface;
	private String address;

	// Définition d'une constante en Java (la valeur ne peut pas être modifiée)
	private static final double taxesPerSquareMeters = 5.0;

	public double computeTaxes(){return taxesPerSquareMeters*surface;}

	public String toString(){
		return "Building("
		+ "owner="
		+ owner
		+ ", surface="
		+ surface
		+ ", address="
		+ address
		+")";
	}

	public String getOwner(){return owner;}
	public String getAddress(){return address;}
	public double getSurface(){return surface;}

	public Building(String owner, double surface, String address){
		this.owner = owner;
		this.surface = surface;
		this.address = address;
	}

	public static void main(String[] args) {
		Building myHouse = new Building("Me", 100, "My address");
		System.out.println(myHouse);
		System.out.println(myHouse.computeTaxes());
	}
}