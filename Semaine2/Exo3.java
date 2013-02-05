class Exo3 {

public static boolean isAnAnagramR(String word1, String word2){
	// isAnagramR("", "") = true
	// isAnagramR(letter+word1, word2+letter+word3) = isAnagramR(word1, word2+word3)
	// false instead
	if (word1.isEmpty() && word2.isEmpty()) return true;
	
    int pos=word2.indexOf(word1.charAt(0));
    if (pos<0) return false;

    word1 = word1.substring(1);
    word2 = word2.substring(0,pos)+word2.substring(pos+1);
    return isAnAnagramR(word1, word2);
}

public static boolean isAnAnagram(String word1, String word2){
	int [] counts = new int[26];
	int l1 = word1.length();
	int l2 = word2.length();

	if (word1.equals(word2)) return true;
	if (l1 != l2) return false;
	
	for (int i=0; i<l1; i++)
		counts[(int)(word1.charAt(i))-97]++;
	for (int i=0; i<l1; i++)
		counts[(int)(word2.charAt(i))-97]--;
	for (int i=0; i<l1; i++)
		if (counts[i] != 0) return false;

	return true;
}
	public static void main(String args[]){

		System.out.println(isAnAnagram("", "")== true);
		System.out.println(isAnAnagram("x", "x") == true);
		System.out.println(isAnAnagram("rage", "gare")==true);

		System.out.println(isAnAnagram("hello", "world") == false);

		System.out.println(isAnAnagramR("", "")== true);
		System.out.println(isAnAnagramR("x", "x") == true);
		System.out.println(isAnAnagramR("rage", "gare")==true);

		System.out.println(isAnAnagramR("hello", "world") == false);
	}
}