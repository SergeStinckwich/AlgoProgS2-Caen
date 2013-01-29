class Exo4 {

public static void main(String args[])
{
float a = 2.0F;
float b = 3.0F;
float c = 1.0F;

float delta = b*b-4*a*c;

if (delta == 0) System.out.println("Une racine double réelle " + -b/(2*a));
	else if (delta >=0) System.out.println("Deux racines réelles " + 
		(-b - Math.sqrt(delta))/(2*a) + 
		" et " +
		(-b + Math.sqrt(delta))/(2*a));
		else System.out.println("Pas de racines réelles.");
}
}