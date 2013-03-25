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

	public void ajouterFin(Object element)
	{
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

	public NoeudSimple premierNoeud()
	{
		return _premier;
	}


	public NoeudSimple dernierNoeud()
	{
		return _dernier;
	}

	public Noeud iemeNoeud(int i)
	{
		NoeudSimple courant = _premier;
		for (int j = 1; j < i; j++){
			if (courant == null) return null;
			courant = (NoeudSimple)courant.suivant();
		}
					return courant;
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

	public static void main(String args[])
	{
		ListeSimple myList = new ListeSimple();
		// Vérifier que la liste est vide
		System.out.println(myList.estVide()==true);
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
		System.out.println(myList.iemeNoeud(1).getElement().equals(5));
		// Vérifier que l'élément en position 2 est 6
		System.out.println(myList.iemeNoeud(2).getElement().equals(6));
		// Vérifier qu'il y a pas d'élément en position 3
		System.out.println(myList.iemeNoeud(3) == null);

		int t[] = {1, 2, 3, 4, 5};
		ListeSimple myList2 = new ListeSimple(t);
		System.out.println(myList2.premierNoeud().getElement().equals(1));
		System.out.println(myList2.dernierNoeud().getElement().equals(5));
		// 1 appartient à t
		System.out.println(myList2.appartient(1) == true);
		// 6 n'appartient pas à t
		System.out.println(myList2.appartient(6) == false);
	}
}