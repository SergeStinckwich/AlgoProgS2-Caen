public class ListeDouble extends ListeSimple2{
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
	_dernier = (NoeudSimple)_dernier.suivant();
	NoeudDouble dernier = (NoeudDouble)_dernier;
	dernier.setPrecedent(this.avant(dernier));
}

public static void main(String args[])
{
	// Création d'une liste vide
	ListeDouble l1 = new ListeDouble();
	// Ajouter 1 au début d'une liste double vide
	l1.ajouterDebut(1);
	// Test que la liste l1 est de longueur 1
	System.out.println(l1.longueur() == 1);
	// Ajouter 2 à la fin d'une liste double
	l1.ajouterFin(2);
	// Test que la liste l1 est de longueur 2
	System.out.println(l1.longueur() == 2);
	// Créer une liste à partir d'un tableau
	int t[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	ListeDouble l2 = new ListeDouble(t);
	// Test que la liste l2 a 10 éléments
	System.out.println(l2.longueur() == 10);
	l2.ajouterFin(11);
}
}