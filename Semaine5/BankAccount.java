class BankAccount {
	
	private String identifier;
	private float amount;

	public String getIdentifier(){return identifier;}
	
	public String getAccountType()
	{return "Simple Bank Account";}

	public float getAmount(){ return amount;}

	public BankAccount(String identifier, float amount){
		this.identifier = identifier;
		this.amount = amount;
	}
}