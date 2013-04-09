public class ListeSimple2 extends ListeSimple{

	protected NoeudSimple _dernier;
	
	public ListeSimple2(){
		super();
	}

	public ListeSimple2(int t[])
	{	
		ListeSimple2 tmp = new ListeSimple2();
		for (int i = t.length-1; i >= 0; i--)
			tmp.ajouterDebut(t[i]);
		_premier = tmp.premierNoeud();
		_dernier = tmp.dernierNoeud();
	}

	public NoeudSimple dernierNoeud(){
		return _dernier;
	}

	public void ajouterDebut(Object element){
		// On réutilise ajouterDebut de la superclasse
		super.ajouterDebut(element);
		//Lors du premier ajout, on positionne _dernier au bon endroit
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

	public boolean supprimerDernier(){
		NoeudSimple dernier = _dernier;
		boolean result = super.supprimerDernier();
		if (this.estVide()) _dernier = null;
			else _dernier = (this.avant(dernier));
		return result;
		}

	public boolean supprimerPremier(){
		if (this.estVide()) return false;
		if (this.longueur() == 1) _premier = null;
		else _premier = (NoeudSimple)_premier.suivant();
		return true;
	}

	public void ajouterSimple(Liste l){
		super.ajouterSimple(l);
		_dernier = (NoeudSimple)l.dernierNoeud();
	}

	// On réutilise la méthode insererApres de la superclasse
	// Il faut s'assurer que lorsqu'on insère après le dernier élément,
	// la variable _dernier doit être également modifiée
	public void insererApres(Noeud noeud, Object element){
		super.insererApres(noeud, element);
	}

}