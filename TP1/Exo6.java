class Exo6 {

	public static char toUpperCase(char c) {
		int asciiCode = (int)c;
		int asciiCodeUpperCase = asciiCode - 32;
		char result = (char) asciiCodeUpperCase;
		return result;
	}

	public static char toLowerCase(char c) {
		return (char)((int)c +32);
	}

	public static void main(String args[])
	{
		char x = args[0].charAt(0);
		System.out.println(toUpperCase(x));
	}
}