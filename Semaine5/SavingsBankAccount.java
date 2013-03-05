import java.util.*;
class SavingsBankAccount extends BankAccount {

	private float savingRate;
	private int yearOfInterests;
	public SavingsBankAccount(String identifier, float balance,
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

	public static SavingsBankAccount edit(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Identifier=");
		String identifier = scan.nextLine();
		System.out.print("Balance=");
		float balance = scan.nextFloat();
		scan.nextLine();
		System.out.print("Saving rate=");
		float savingRate = scan.nextFloat();
		scan.nextLine();
		System.out.print("Year of interests=");	
		int yearOfInterests = scan.nextInt();
		scan.nextLine();
		SavingsBankAccount account = new SavingsBankAccount(identifier, balance, savingRate);
		account.setYearOfInterests(yearOfInterests);
		return account;
	}

	public void setYearOfInterests(int yearOfInterests){this.yearOfInterests = yearOfInterests;}

	public float getBalance(){
		return super.getBalance()+super.getBalance()*savingRate*yearOfInterests;}

}