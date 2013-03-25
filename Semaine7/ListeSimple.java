public class ListeSimple extends Liste {
	private NoeudSimple _premier;
	private NoeudSimple _dernier;

	public ListeSimple()
	{
		_premier = null;
		_dernier = null;
	}

	public boolean estVide()
	{
		return (_premier  == null);
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

	public int longueur(){
		int sum=0;
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
		System.out.println(myList.estVide()==true);
		myList.ajouterDebut(5);
		myList.ajouterFin(6);
		System.out.println(myList.premierNoeud().getElement().equals(5));
		System.out.println(myList.estVide()==false);
		System.out.println(myList.longueur() == 2);
	}
}