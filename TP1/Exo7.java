class Exo7 {

// Documentation String
// http://docs.oracle.com/javase/7/docs/api/java/lang/String.html

	public static boolean compareChaine2(String c1, String c2){
		// Idem que compareChaine mais sans tenir des minuscules et
		// des majuscules

		// if (c1.length() != c2.length()) return false;
		// for (int i=0; i<c1.length(); i++)
		// 	if (toLowerCase(c1.charAt(i)) != toLowerCase(c2.charAt(i)))
		// 	return false;
		// return true;

		return (c1.toLowerCase().compareTo(c2.toLowerCase()) == 0);

	}

	public static boolean isLowerCase(char c){
		return (c >= 'a')&&(c <= 'z');
	}

	public static char toLowerCase(char c){
		int difference = 32;
		if (isLowerCase(c)) return c;
		return (char)((int)c+difference);	
	}

	public static boolean compareChaine(String c1, String c2){
		// if (c1.length() != c2.length()) return false;
		// for (int i=0; i<c1.length(); i++)
		// 	if (c1.charAt(i) != c2.charAt(i))
		// 		return false;
		// return true;

		return c1.compareTo(c2)==0;
	}

	public static void main(String args[]){
	System.out.println(compareChaine2("HeLlOwOrLd", "HelloWorld"));

	System.out.println(compareChaine("HelloWorld", "Hello"+"World"));
	System.out.println(compareChaine("BonjourMonde", "Hello"+"World"));

	}
}
