public class Factory extends Building {
	String companyName;

	public Factory(String owner, double surface,
		String address, String companyName){
		super(owner, surface, address);
		this.companyName = companyName;
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
		+")";
	}
	
	public static void main(String[] args){
		Factory myFactory = new Factory("John", 1000, "San Francisco", "Google");
		System.out.println(myFactory);
		System.out.println(myFactory.computeTaxes());
	}
}