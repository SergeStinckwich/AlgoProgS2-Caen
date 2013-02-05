class Exo3
{

public static void main(String args[])
{
int month = 7;
String monthString = "";

switch (month) {
	case 1: monthString = "Janvier"; break;
	case 2: monthString = "Fevrier"; break;
	case 3: monthString = "Mars"; break;
	case 4: monthString = "Avril"; break;
	case 5: monthString = "Mai"; break;
	case 6: monthString = "Juin"; break;
	case 7: monthString = "Juillet"; break;
	case 8: monthString = "Aout"; break;
	case 9: monthString = "Septembre"; break;
	case 10: monthString = "Octobre"; break;
	case 11: monthString = "Novembre"; break;
	case 12: monthString = "Decembre"; break;
	default: monthString = "Erreur"; break;
}

System.out.println(monthString);
}
}