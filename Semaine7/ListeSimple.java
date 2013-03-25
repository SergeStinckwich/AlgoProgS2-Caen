public class ListeSimple extends Liste {
	private NoeudSimple _premier;
	private NoeudSimple _fin;

	public ListeSimple()
	{
		_premier = null;
		_fin = null;
	}

	public boolean estVide()
	{
		return (_premier  == null);
		// if (_premier == null)
		// return true;
		// else return false; 
	}

	public void ajouterDebut(Object element)
	{
		NoeudSimple n = new NoeudSimple(element);
		if (this.estVide())
		{
			_premier = n;
			_fin = n;
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
			_fin = n;
		}
		else
		{
			_fin.setSuivant(n);
			_fin = n;
		}
	}

	public NoeudSimple premierNoeud()
	{
		return _premier;
	}


	public static void main(String args[])
	{
		ListeSimple myList = new ListeSimple();
		System.out.println(myList.estVide()==true);
		myList.ajouterDebut(5);
		myList.ajouterFin(6);
		System.out.println(myList.premierNoeud().getElement().equals(5));
		System.out.println(myList.estVide()==false);
	}
}