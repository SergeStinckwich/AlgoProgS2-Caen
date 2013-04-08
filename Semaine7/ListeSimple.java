public class ListeSimple extends Liste {
	private NoeudSimple _premier;
	private NoeudSimple _dernier;

	public ListeSimple()
	{
		_premier = null;
		_dernier = null;
	}

	public ListeSimple(int t[])
	{	
		ListeSimple tmp = new ListeSimple();
		for (int i = t.length-1; i >= 0; i--)
			tmp.ajouterDebut(t[i]);
		_premier = tmp.premierNoeud();
		_dernier = tmp.dernierNoeud();
	}

	protected NoeudSimple avant(NoeudSimple cible){
		NoeudSimple courant = this.premierNoeud();
		while (courant!=null){
			if (courant.suivant() == cible) return courant;
			courant = (NoeudSimple) courant.suivant();
		}
		return null;
		} 

	public Liste copieSuperficielle(){
		Liste newListe = new ListeSimple();
		NoeudSimple courant = (NoeudSimple)newListe.premierNoeud();
		while(courant != null)
		{
			newListe.ajouterFin(courant.getElement());
			courant = (NoeudSimple)courant.suivant();
		}
		return newListe;
	}

	public boolean estVide(){
		return _premier == null;
	}

	public boolean appartient(Object element){
		boolean elementTrouve = false;
		NoeudSimple courant = _premier;
		while(!elementTrouve)
		{
			if (courant == null) return false;
			if ((courant.getElement()) == element)
				elementTrouve = true;
			else courant = (NoeudSimple)courant.suivant();
		}
		return true;
	}

	public boolean noeudDansCetteListe(Noeud n){
		boolean noeudTrouve = false;
		NoeudSimple courant = _premier;
		while(!noeudTrouve){
			if (courant == null) return false;
			if (courant == n)
				noeudTrouve = true;
			else courant = (NoeudSimple)courant.suivant();
		}
		return true;
	}
	
	public void ajouterDebut(Object element)
	{
		NoeudSimple n = new NoeudSimple(element);
		if (this.estVide())
		{
			_premier = n;
			_dernier = n;
		}
		else
		{
			n.setSuivant(_premier);
			_premier = n;
		}
	}

	public void ajouterFin(Object element){
		NoeudSimple n = new NoeudSimple(element);
		if (this.estVide())
		{
			_premier = n;
			_dernier = n;
		}
		else
		{
			_dernier.setSuivant(n);
			_dernier = n;
		}
	}

	public NoeudSimple premierNoeud(){
		return _premier;
	}

	public NoeudSimple dernierNoeud(){
		return _dernier;
	}

	public Noeud iemeNoeud(int i){
		NoeudSimple courant = _premier;
		for (int j = 0; j < i; j++){
			if (courant == null) return null;
			courant = (NoeudSimple)courant.suivant();
		}
					return courant;
	}

	public boolean supprimerDernier(){
		if (this.estVide()) return false;
		if (this.longueur() == 1){
			_premier = null;
			_dernier = null;
		}
		else {
			_dernier = (NoeudSimple)this.avant(_dernier);
			_dernier.setSuivant(null);
		}
		return true;
	}

	public boolean supprimerPremier(){
		if (this.estVide()) return false;
		if (this.longueur() == 1){
			_premier = null;
			_dernier = null;
		}
		else _premier = (NoeudSimple)_premier.suivant();
		return true;
	}

	public int longueur(){
		int sum = 0;
		NoeudSimple courant = _premier;
		while(courant != null)
		{
			sum++;
			courant = (NoeudSimple)courant.suivant();
		}

		return sum;
	}
	public void insererApres(Noeud noeud, Object element){
		if ((noeud == null)||(!this.appartient(noeud)))
			this.ajouterFin(element);
		else{
			NoeudSimple nouveauNoeud = new NoeudSimple(element);
			nouveauNoeud.setSuivant(noeud.suivant());
			noeud.setSuivant(nouveauNoeud);
			if (_dernier == noeud) _dernier = nouveauNoeud;
		}
	}

	public void insererAvant(Noeud noeud, Object element){
		NoeudSimple noeudAvant = (NoeudSimple)this.avant((NoeudSimple)noeud);
		if (noeudAvant == null) this.ajouterDebut(element);
		else
			this.insererApres(noeudAvant, element);
	}
	public Noeud ouEstElement(Object element){
		NoeudSimple courant = _premier;
		while(courant != null){
			if (courant.getElement()==element) return courant;
			courant = (NoeudSimple)courant.suivant();
		}
		return null;
	}

	public int positionElement(Object element){
		NoeudSimple courant = _premier;
		int position = 0;
		while(courant != null){
			if (courant.getElement() == element) return position;
			courant = (NoeudSimple)courant.suivant();
			position++;
		}
		return -1; //Not found
	}

	public int positionNoeud(Noeud noeud){
		NoeudSimple courant = _premier;
		int position = 0;
		while(courant != null){
			if (courant == noeud) return position;
			courant = (NoeudSimple)courant.suivant();
			position++;
		}
		return -1; //Not found
	}

	public void ajouterSimple(Liste l){
		this.dernierNoeud().setSuivant(l.premierNoeud());
	}

	public void ajouterAvecNouveauNoeuds(Liste l){
		Noeud n;
		for (int i=0; i<= l.longueur()-1; i++){
			n = l.iemeNoeud(i);
			this.ajouterFin(new NoeudSimple(n.getElement()));
		}
	}

	public Liste selectionElements(Selecteur select){
		Liste nouvelleListe = new ListeSimple();
		for (int i = 0; i <= this.longueur()-1; i++){
			Object elementCourant = this.iemeNoeud(i).getElement();
			if (select.garder(elementCourant))
			nouvelleListe.ajouterFin(elementCourant);
		}
		return nouvelleListe;
	}

	public static void main(String args[])
	{
		// Créer une nouvelle liste vide
		ListeSimple myList = new ListeSimple();

		// Vérifier que la liste est vide
		System.out.println(myList.estVide() == true);

		// ajouter 5 en début de liste
		myList.ajouterDebut(5);

		// ajouter 6 en fin de liste
		myList.ajouterFin(6);

		// Vérifier que le premier noeud est 5
		System.out.println(myList.premierNoeud().getElement().equals(5));

		// Vérifier que la liste n'est plus vide
		System.out.println(myList.estVide() == false);

		// Vérifier que la liste est de longueur 2
		System.out.println(myList.longueur() == 2);

		// Vérifier que l'élément en position 1 est 5
		System.out.println(myList.iemeNoeud(0).getElement().equals(5));

		// Vérifier que l'élément en position 2 est 6
		System.out.println(myList.iemeNoeud(1).getElement().equals(6));

		// Vérifier qu'il y a pas d'élément en position 3
		System.out.println(myList.iemeNoeud(2) == null);

		// Créer une liste à partir d'un tableau t
		int t[] = {1, 2, 3, 4, 5};
		ListeSimple myList2 = new ListeSimple(t);

		// Vérifier que 1 est le premier élément de la liste
		System.out.println(myList2.premierNoeud().getElement().equals(1));

		// Vérifier que 5 est le dernier élément de la liste
		System.out.println(myList2.dernierNoeud().getElement().equals(5));

		// Vérifier que 1 appartient à t
		System.out.println(myList2.appartient(1) == true);

		// Vérifier que 6 n'appartient pas à t
		System.out.println(myList2.appartient(6) == false);

		// Vérifier que le noeud avant le premier noeud n'existe pas
		System.out.println(myList2.avant(myList2.premierNoeud()) == null);

		// Vérifier que le noeud avant le dernier noeud est le noeud contenant 4
		System.out.println(myList2.avant(myList2.dernierNoeud()).getElement().equals(4));

		// Vérifier que la liste myList2 après suppression du premier noeud, commence par l'élement 2
		myList2.supprimerPremier();
		System.out.println(myList2.premierNoeud().getElement().equals(2));

		// Vérifier que la liste myList2 après suppression du dernier noeud a
		// comme dernier noeud 4.
		myList2.supprimerDernier();
		System.out.println(myList2.dernierNoeud().getElement().equals(4));

		// Vérifier qu'insérer après le premier noeud, augmente la taille de la liste de 1
		myList2.insererApres(myList2.premierNoeud(), 1);
		System.out.println(myList2.longueur() == 4);

		// Vérifier qu'après avoir inséré avant le premier noeud, l'élément 0, on a l'élément 0
		//en tête de la liste 
		myList2.insererAvant(myList2.premierNoeud(), 0);
		System.out.println(myList2.premierNoeud().getElement().equals(0));

		// Tests de la fonction selectionElements
		int t2[] = {3, 2, 3, 4, 3, 5};
		ListeSimple myList3 = new ListeSimple(t2);
		Identique egalATrois = new Identique(3);
		System.out.println(myList3.selectionElements(egalATrois).longueur() == 3);
	}
}