class SomeStringFunctions {

public static void main(String args[]){


	String word1 = "Bonjour";

	System.out.println(word1.substring(1).equals("onjour"));
	System.out.println(word1.substring(0).equals("Bonjour"));

	System.out.println(word1.substring(1, 6).equals("onjou"));

	System.out.println(word1.indexOf('B') == 0);
	System.out.println(word1.indexOf('o') == 1);

	System.out.println(word1.indexOf('X') == -1);

	System.out.println(word1.isEmpty() == false);
	System.out.println("".isEmpty() == true);

}

}