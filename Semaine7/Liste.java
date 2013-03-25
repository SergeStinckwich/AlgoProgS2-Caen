
public abstract class Liste {
	public abstract Noeud premierNoeud();
	// public abstract Noeud dernierNoeud();
	// public Object premierElement(){
	//  	if (premierNoeud()==null) return null;
	//  	return premierNoeud().getElement();
	// }
	// public Object dernierElement(){
	// 	if (premierNoeud()==null) return null;
	// 	return dernierNoeud().getElement();
	// }
	public abstract void ajouterDebut(Object element);
	public abstract void ajouterFin(Object element);
	public abstract boolean estVide();
	// public abstract int longueur();
	// public abstract boolean appartient(Object element);
	// public abstract boolean noeudDansCetteListe(Noeud noeud);
	// public abstract Noeud ouEstElement(Object element);
	// public abstract boolean supprimerPremier();
	// public abstract boolean supprimerDernier();
	// public abstract Noeud iemeNoeud(int num);
	// public Object iemeElement(int num){
	// 	Noeud ieme =iemeNoeud(num);
	// 	if (ieme==null) return null;
	// 	return ieme.getElement();
	// }
	// public abstract int positionElement(Object element);
	// public abstract int positionNoeud(Noeud noeud);
	// public abstract Liste copieSuperficielle();
	// public abstract void insererApres(Noeud noeud, Object element);
	// public abstract void insererAvant(Noeud noeud, Object element);
	// public abstract void ajouterSimple(Liste l);
	// public abstract void ajouterAvecNouveauNoeuds(Liste l);
	// public abstract Liste selectionElements(Selecteur select);
	// public String toString(){
	// 	String mess="[";
	// 	Noeud actuel=this.premierNoeud();
	// 	while(actuel!=null){
	// 		mess+=actuel.getElement();
	// 		actuel=actuel.suivant();
	// 		if (actuel!=null) mess+=", ";
	// 	}
	// 	mess+="]";
	// 	return mess;
	// }
}

