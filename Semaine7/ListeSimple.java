public class ListeSimple extends Liste {
	private NoeudSimple _premier;

	public ListeSimple()
	{
		_premier = null;
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
		}
		else
		{
			n.setSuivant(_premier);
			_premier = n;
		}

	}

	public static void main(String args[])
	{

		ListeSimple myList = new ListeSimple();
		System.out.println(myList.estVide());
	}
}