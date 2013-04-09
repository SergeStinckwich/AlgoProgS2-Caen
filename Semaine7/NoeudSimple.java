public class NoeudSimple extends Noeud{
	private NoeudSimple _suivant;

	public NoeudSimple(Object element){
		super(element);
		_suivant=null;
	}

	public Noeud suivant(){
		return _suivant;
	}

	public void setSuivant(Noeud ns){
	_suivant=(NoeudSimple)ns;
	}

	public static void main(String args[])
	{
	// Exemples de noeuds simples
	NoeudSimple n1, n2, n3, n4;

	n1 = new NoeudSimple(1);
	n2 = new NoeudSimple(2);
	n3 = new NoeudSimple("Bonjour");
	n4 = new NoeudSimple(true);

	n1.setSuivant(n2);
	n2.setSuivant(n3);
	n3.setSuivant(n4);
	n4.setSuivant(null);
}
}