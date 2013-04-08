public class NoeudDouble extends NoeudSimple {
	private Noeud precedent=null;

	public NoeudDouble(Object element) {
		super(element);}

	public Noeud precedent() {
			return precedent;}

	public void setPrecedent(Noeud precedent){
		this.precedent = precedent; }
}