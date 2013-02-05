class Exo5{

public static String convertIntToString(int x){
	boolean negativeNumber = false;
	String result = "";
	int digit;
	int value = x;

	if (x<0) {negativeNumber = true; value = - value;}
	while (value!=0){
		digit = value%10;
		result = (char)(digit+48)+result;
		value = value / 10;
	}
	if (negativeNumber) result = "-"+result;
	return result;
}

public static void main(String[] args) {
	
	System.out.println(convertIntToString(1).equals("1"));
	System.out.println(convertIntToString(17).equals("17"));
	System.out.println(convertIntToString(1234).equals("1234"));

	System.out.println(convertIntToString(-5).equals("-5"));
	System.out.println(convertIntToString(-999).equals("-999"));
}
}