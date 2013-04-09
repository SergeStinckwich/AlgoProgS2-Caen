public class ListeSimple2 extends ListeSimple{

	protected NoeudSimple _dernier;
	
	public ListeSimple2(){
		super();
	}

	public ListeSimple2(int[] valeurs){
			super(valeurs);
	}

	public void ajouterDebut(Object element){
		// On réutilise ajouterDebut de la superclasse
		super.ajouterDebut(element);
		if (this.longueur() == 1) _dernier = _premier;
	}

	public void ajouterFin(Object element){
		// On redéfinit la méthode ajouterFin afin de tirer partie
		// de l'attribut _dernier
		NoeudSimple n = (NoeudSimple)this.creationNoeud(element);
		if (this.estVide()){
			_premier = n;
			_dernier = n;}
		else{
			_dernier.setSuivant(n);
			_dernier = (NoeudSimple)_dernier.suivant();}
	}

public static void main(String args[])
{
	// Une listeSimple2 est une ListeSimple avec en plus un dernier élément

	// Créer une nouvelle liste vide
	ListeSimple2 l1 = new ListeSimple2();

	// Vérifier que la liste est vide
	System.out.println(l1.estVide() == true);

	// Ajouter 1 en début de liste
	l1.ajouterDebut(1);

	// Ajouter 2 en fin de liste
	l1.ajouterFin(2);

	// Vérifier que le premier noeud est 1
	System.out.println(l1.premierNoeud().getElement().equals(5));

	// Vérifier que la liste n'est plus vide
	System.out.println(l1.estVide() == false);

	// Vérifier que la liste est de longueur 2
	System.out.println(l1.longueur() == 2);

}
}