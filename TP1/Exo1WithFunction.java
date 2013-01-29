class Exo1WithFunction {

public static float maximum(float number1, float number2)
{
	if (number1>number2) return number1;
	else return number2;
}

public static void main(String args[])
{
	float number1 = 2.0F;
	float number2 = 4.0F;
	float maximum;
	maximum = maximum(number1, number2);
	System.out.println("Le maximum de " + number1 + 
			" et " + number2 + " est = " + maximum);

}
}