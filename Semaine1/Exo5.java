class Exo5 {

public static long factorial(long n){
	long factorial = 1;

	for (int i = 1; i<=n; i++)
		factorial = factorial * i;

	// int i = 1;
	// while (i<=n) {
	// 		factorial = factorial * i;
	// 		i++;
	// 	}

	return factorial;
}

public static void main(String args[]){
	for (int j=1; j<21; j++){
		System.out.println("Factorial of " 
				+ j 
				+ " = " 
				+ factorial(j));
	}
}

// Factorial of 1 = 1
// Factorial of 2 = 2
// Factorial of 3 = 6
// Factorial of 4 = 24
// Factorial of 5 = 120
// Factorial of 6 = 720
// Factorial of 7 = 5040
// Factorial of 8 = 40320
// Factorial of 9 = 362880
// Factorial of 10 = 3628800
// Factorial of 11 = 39916800
// Factorial of 12 = 479001600
// Factorial of 13 = 6227020800
// Factorial of 14 = 87178291200
// Factorial of 15 = 1307674368000
// Factorial of 16 = 20922789888000
// Factorial of 17 = 355687428096000
// Factorial of 18 = 6402373705728000
// Factorial of 19 = 121645100408832000
// Factorial of 20 = 2432902008176640000

}