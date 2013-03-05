import java.util.*;
class InterestsCalculation{

	public BankAccount editBankAccount(){
		System.out.println("1) BankAccount 2) SavingBankAccount");
		Scanner scan = new Scanner(System.in);
		int result = scan.nextInt();
		System.out.println("Identifier=");
		String identifier = scan.nextLine();
		System.out.println("Amount=");
		float amount = scan.nextFloat();
		if (result == 1)
		{
			return new BankAccount(identifier, amount);
		}
		System.out.println("Saving rate=");
		float savingRate = scan.nextFloat();
		System.out.println("Year of interests=");	
		int yearOfInterests = scan.nextInt();
		SavingBankAccount account = new SavingBankAccount(identifier, amount, savingRate);
		account.setYearOfInterests(yearOfInterests);
		return account;
	}

	public static void main(String [] args){
		BankAccount account1 = new BankAccount ("A01", 1000f);
		SavingBankAccount account2;
		account2 = new SavingBankAccount ("E99", 1000f, 0.1f);
		account2.setYearOfInterests(5);

		BankAccount c;
		c = account1;
		System.out.println(c);
		c = account2;
		System.out.println(c);
    }
}