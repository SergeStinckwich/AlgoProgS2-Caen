import java.util.*;
class InterestsCalculation{

	public static BankAccount editBankAccount(){
		System.out.print("1) BankAccount 2) SavingBankAccount=");
		Scanner scan = new Scanner(System.in);
		int result = scan.nextInt();
		scan.nextLine();
		if (result == 1) return BankAccount.edit();
		return SavingsBankAccount.edit();
	}

	public static void main(String [] args){
		BankAccount account1 = new BankAccount();
		account1.setIdentifier("A01");
		account1.setBalance(1000f);
		account1.deposit(100.0f);

		SavingsBankAccount account2;
		account2 = new SavingsBankAccount ("E99", 1000f, 0.1f);
		account2.setYearOfInterests(5);
		account2.withdraw(1000.0f);

		BankAccount account3 = account1;
		System.out.println(account3);
		account3 = account2;
		
		System.out.println(account3);
		
		System.out.println(InterestsCalculation.editBankAccount());
    }
}