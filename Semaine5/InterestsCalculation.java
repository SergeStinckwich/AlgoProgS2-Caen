import java.util.*;
class InterestsCalculation{

	public static BankAccount editBankAccount(){
		System.out.print("1) BankAccount 2) SavingBankAccount=");
		Scanner scan = new Scanner(System.in);
		int result = scan.nextInt();
		scan = new Scanner(System.in);
		System.out.print("Identifier=");
		String identifier = scan.nextLine();
		scan = new Scanner(System.in);
		System.out.print("Amount=");
		float amount = scan.nextFloat();
		if (result == 1){
			return new BankAccount(identifier, amount);
		}
		System.out.print("Saving rate=");
		float savingRate = scan.nextFloat();
		scan = new Scanner(System.in);
		System.out.print("Year of interests=");	
		int yearOfInterests = scan.nextInt();
		scan = new Scanner(System.in);
		SavingBankAccount account = new SavingBankAccount(identifier, amount, savingRate);
		account.setYearOfInterests(yearOfInterests);
		return account;
	}

	public static void main(String [] args){
		BankAccount account1 = new BankAccount ("A01", 1000f);
		SavingBankAccount account2;
		account2 = new SavingBankAccount ("E99", 1000f, 0.1f);
		account2.setYearOfInterests(5);
		BankAccount account3 = account1;
		System.out.println(account3);
		account3 = account2;
		System.out.println(account3);
		System.out.println(InterestsCalculation.editBankAccount());
    }
}