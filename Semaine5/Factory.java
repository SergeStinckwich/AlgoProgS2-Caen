public class Factory extends Building {
	String companyName;
	int employeeNumber;
	int deliveryNumber;

	public Factory(String owner, double surface,
		String address, String companyName,
		int employeeNumber, int deliveryNumber){
		super(owner, surface, address);
		this.companyName = companyName;
		this.employeeNumber = employeeNumber;
		this.deliveryNumber = deliveryNumber;
	}

	public String toString(){
		return "Factory("
		+ "owner="
		+ this.getOwner()
		+ ", surface="
		+ this.getSurface()
		+ ", address="
		+ this.getAddress()
		+ ", companyName="
		+ this.companyName
		+ ", employeeNumber="
		+ this.employeeNumber
		+ ", deliveryNumber="
		+ this.deliveryNumber
		+")";
	}
	
	double vehiculeFlow(){
		return 0.75*employeeNumber + deliveryNumber;
	}

	public static void main(String[] args){
		Factory myFactory = new Factory("John", 1000, "San Francisco", "Google", 10000, 100);
		System.out.println(myFactory);
		System.out.println(myFactory.computeTaxes());
	}
}