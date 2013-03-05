class SavingBankAccount extends BankAccount {

	private float savingRate;
	private int yearOfInterests;
	public SavingBankAccount(String identifier, float amount,
			float savingRate){
	super(identifier, amount);
	this.savingRate = savingRate;
}

	public void setYearOfInterests(int yearOfInterests)
	{this.yearOfInterests = yearOfInterests;}

	public String getAccountType()
	{return "Bank Account with interests";}
}