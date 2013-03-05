class BankAccount {
	
	private String identifier;
	private float amount;

	public String getIdentifier(){return identifier;}
	
	public String getAccountType()
	{return "BankAccount";}

	public float getAmount(){ return amount;}

	public String toString(){
		return "BankAccount(identifier="
				+identifier
				+", amount="
				+amount
				+")";
	}
	public BankAccount(String identifier, float amount){
		this.identifier = identifier;
		this.amount = amount;
	}
}