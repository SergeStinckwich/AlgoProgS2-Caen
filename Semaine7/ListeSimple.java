public class ListeSimple extends Liste {
	protected NoeudSimple _premier;

	public Liste creationListe(){
		return new ListeSimple();}

	public Noeud creationNoeud(Object element){
		return new NoeudSimple(element);}

	public ListeSimple()
	{
		_premier = null;
	}

	public ListeSimple(int t[])
	{	
		ListeSimple tmp = new ListeSimple();
		for (int i = t.length-1; i >= 0; i--)
			tmp.ajouterDebut(t[i]);
		_premier = tmp.premierNoeud();
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
	
	public void ajouterDebut(Object element){
		NoeudSimple n = (NoeudSimple)this.creationNoeud(element);
		if (this.estVide()) _premier = n;
		else{
			n.setSuivant(_premier);
			_premier = n;
		}
	}

	public void ajouterFin(Object element){
		NoeudSimple n = (NoeudSimple)this.creationNoeud(element);
		if (this.estVide())
			_premier = n;
		else (this.dernierNoeud()).setSuivant(n);
	}

	public NoeudSimple premierNoeud(){
		return _premier;
	}

	public NoeudSimple dernierNoeud(){
		NoeudSimple courant = _premier;
		while (courant.suivant() != null)
		{
			courant = (NoeudSimple)courant.suivant();
		}
		return courant;
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
		if (this.longueur() == 1) _premier = null;
		else ((NoeudSimple)this.avant(this.dernierNoeud())).setSuivant(null);
		return true;
	}

	public boolean supprimerPremier(){
		if (this.estVide()) return false;
		if (this.longueur() == 1) _premier = null;
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
			NoeudSimple nouveauNoeud = (NoeudSimple)creationNoeud(element);
			nouveauNoeud.setSuivant(noeud.suivant());
			noeud.setSuivant(nouveauNoeud);
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


}