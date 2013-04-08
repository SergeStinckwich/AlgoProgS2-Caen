public class ListeDouble extends ListeSimple{

public ListeDouble(){
	super();
}

public ListeDouble(int[] valeurs){
	super(valeurs);}

public Noeud creationNoeud(Object element) {
	return new NoeudDouble(element);
}

public Liste creationListe() {
	return new ListeDouble();
}

public void ajouterDebut(Object element){
	super.ajouterDebut(element);
	NoeudDouble premier = (NoeudDouble)_premier;
	NoeudDouble suivant = (NoeudDouble)_premier.suivant();
	premier.setPrecedent(null);
	if (suivant != null) suivant.setPrecedent(premier);
}

public void ajouterFin(Object element){
	super.ajouterFin(element);
	NoeudDouble premier = (NoeudDouble)_premier;
}
public static void main(String args[])
{
	ListeDouble l = new ListeDouble();
	// Ajouter 1 au début d'une liste double
	l.ajouterDebut(1);
	System.out.println(l.longueur() == 1);
	// Ajouter 2 à la fin d'une liste double
	l.ajouterFin(2);
	System.out.println(l.longueur() == 2);
}
}