class Exo4{

public static int convertStringToInt(String c){
	boolean negativeNumber = false;
	int nextCharacterPosition = 0;
	int result = 0;

	if (c.charAt(0) == '-'){
		negativeNumber = true;
		nextCharacterPosition = 1;}

	for (int i=nextCharacterPosition; i< c.length(); i++){
			result = result * 10;
			result = result + (int)c.charAt(i)-48;
		}
	if (negativeNumber) result = - result;
	return result;
}

public static void main(String args[]){


	System.out.println(convertStringToInt("1") == 1);
	System.out.println(convertStringToInt("17") == 17);
	System.out.println(convertStringToInt("1234") == 1234);

	System.out.println(convertStringToInt("-5") == -5);
	System.out.println(convertStringToInt("-999") == -999);
}

}