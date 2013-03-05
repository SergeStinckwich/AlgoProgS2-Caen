import java.util.*;
public class BankAccount {
	
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

	public static BankAccount edit(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Identifier=");
		String identifier = scan.nextLine();
		System.out.print("Balance=");
		float balance = scan.nextFloat();
		scan.nextLine();
		return new BankAccount(identifier, balance);
	}

	public void deposit(float v){balance = balance+v;}

	public void withdraw(float v){balance = balance-v;}

	public String getAccountType(){return this.getClass().getName();}

	public BankAccount(){}

	public BankAccount(String identifier, float balance){
		this.identifier = identifier;
		this.balance = balance;
	}
}