class BankAccount {
	
	private String identifier;
	private float amount;

	public String getIdentifier(){return identifier;}
	
	public void setIdentifier(String identifier){this.identifier = identifier;}

	public float getAmount(){return amount;}

	public void setAmount(float amount){this.amount = amount;}

	public String toString(){
		return "BankAccount(identifier="
				+identifier
				+", amount="
				+amount
				+")";
	}

	public String getAccountType(){return "BankAccount";}

	public BankAccount(){}

	public BankAccount(String identifier, float amount){
		this.identifier = identifier;
		this.amount = amount;
	}
}