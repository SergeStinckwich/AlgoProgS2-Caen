class SavingBankAccount extends BankAccount {

	private float savingRate;
	private int yearOfInterests;
	public SavingBankAccount(String identifier, float balance,
			float savingRate){
	super(identifier, balance);
	this.savingRate = savingRate;
}

	public String toString(){
		return "SavingBankAccount(identifier="
				+this.getIdentifier()
				+", balance="
				+this.getBalance()
				+", savingRate="
				+savingRate
				+", yearOfInterests="
				+yearOfInterests
				+")";
	}
	public void setYearOfInterests(int yearOfInterests)
	{this.yearOfInterests = yearOfInterests;}

	public float getBalance(){
		return super.getBalance()+super.getBalance()*savingRate*yearOfInterests;}

	public String getAccountType()
	{return "SavingBankAccount";}
}