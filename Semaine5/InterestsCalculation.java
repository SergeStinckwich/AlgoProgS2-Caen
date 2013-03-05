import java.util.*;
class InterestsCalculation{

	public static BankAccount editBankAccount(){
		System.out.print("1) BankAccount 2) SavingBankAccount=");
		Scanner scan = new Scanner(System.in);
		int result = scan.nextInt();
		scan.nextLine();
		System.out.print("Identifier=");
		String identifier = scan.nextLine();
		System.out.print("Balance=");
		float balance = scan.nextFloat();
		scan.nextLine();
		if (result == 1){
			return new BankAccount(identifier, balance);
		}
		System.out.print("Saving rate=");
		float savingRate = scan.nextFloat();
		scan.nextLine();
		System.out.print("Year of interests=");	
		int yearOfInterests = scan.nextInt();
		scan.nextLine();
		SavingBankAccount account = new SavingBankAccount(identifier, balance, savingRate);
		account.setYearOfInterests(yearOfInterests);
		return account;
	}

	public static void main(String [] args){
		BankAccount account1 = new BankAccount();
		account1.setIdentifier("A01");
		account1.setBalance(1000f);
		account1.deposit(100.0f);

		SavingBankAccount account2;
		account2 = new SavingBankAccount ("E99", 1000f, 0.1f);
		account2.setYearOfInterests(5);
		account2.withdraw(1000.0f);
		
		BankAccount account3 = account1;
		System.out.println(account3);
		account3 = account2;
		
		System.out.println(account3);
		
		System.out.println(InterestsCalculation.editBankAccount());
    }
}