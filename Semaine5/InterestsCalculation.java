class InterestsCalculation{

	public static void main(String [] args){
	BankAccount account1 = new BankAccount ("A01", 1000f);
	SavingBankAccount account2;
	account2 = new SavingBankAccount ("E99", 1000f, 0.1f);
	account2.setYearOfInterests(5);

	BankAccount c;
	String message = "L'argent qui dort ne rapporte rien :";
	c = account1;
	message += "\n Bank account amount " + c.getIdentifier() + " : "
	+ c.getAmount() + " "+c.getAccountType();

	c = account2;
	message += "\n Bank account amount "
           + c.getIdentifier() + " : " + c.getAmount() + " "+c.getAccountType();

    System.out.println(message);
}
}