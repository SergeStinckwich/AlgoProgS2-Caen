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

}