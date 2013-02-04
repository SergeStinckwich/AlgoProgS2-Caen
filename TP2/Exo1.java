class Exo1 {

	static boolean isAPalindrome(String c) {
		int l = c.length();
		if (l <= 1) return true;
		for (int i=0; i <= l/2; i++)
			if (c.charAt(i) != c.charAt(l-i-1))
				return false;
		return true;
	}

	public static void main(String args [])
	{
		System.out.println(isAPalindrome("")==true);
		System.out.println(isAPalindrome("ete")==true);
		System.out.println(isAPalindrome("eluparcettecrapule")==true);

		System.out.println(isAPalindrome("HelloWorld")==false);
	}
}