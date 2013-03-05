class BankAccount {
	
	private String identifier;
	private float balance;

	public String getIdentifier(){return identifier;}
	
	public void setIdentifier(String identifier){this.identifier = identifier;}

	public float getBalance(){return balance;}

	public void setBalance(float balance){this.balance = balance;}

	public String toString(){
		return "BankAccount(identifier="
				+identifier
				+", balance="
				+balance
				+")";
	}

	public void deposit(float v){balance = balance+v;}

	public void withdraw(float v){balance = balance-v;}

	public String getAccountType(){return "BankAccount";}

	public BankAccount(){}

	public BankAccount(String identifier, float balance){
		this.identifier = identifier;
		this.balance = balance;
	}
}