class SavingBankAccount extends BankAccount {

	private float savingRate;
	private int yearOfInterests;
	public SavingBankAccount(String identifier, float amount,
			float savingRate){
	super(identifier, amount);
	this.savingRate = savingRate;
}

	public String toString(){
		return "SavingBankAccount(identifier="
				+this.getIdentifier()
				+", amount="
				+this.getAmount()
				+", savingRate="
				+savingRate
				+", yearOfInterests="
				+yearOfInterests
				+")";
	}
	public void setYearOfInterests(int yearOfInterests)
	{this.yearOfInterests = yearOfInterests;}

	public float getAmount(){
		return super.getAmount()+super.getAmount()*savingRate*yearOfInterests;}

	public String getAccountType()
	{return "SavingBankAccount";}
}