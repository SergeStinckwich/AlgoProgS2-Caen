class Exo6{

	public static char toUpperCase(char c){
		// int codeAsciiLowerCase = (int) c;
		// int difference = 32;
		// int codeAsciiUpperCase = codeAsciiLowerCase 
		// 			- difference;
		// return (char) codeAsciiUpperCase;

		int difference = 32;
		return (char)((int)c-difference);
	}

	public static char toLowerCase(char c){
		int difference = 32;
		return (char)((int)c+difference);	
	}

	public static boolean isUpperCase(char c){
		return (c >= 'A')&&(c <= 'Z');
	}

	public static boolean isLowerCase(char c){
		return (c >= 'a')&&(c <= 'z');
	}

	public static void main(String args[]){
		System.out.println(isUpperCase('X') == true);
		System.out.println(toLowerCase(toUpperCase('x')) == 'x');
	}
}