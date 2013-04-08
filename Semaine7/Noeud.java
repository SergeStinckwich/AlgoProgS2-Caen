public abstract class Noeud {
	private Object _element;
	public Noeud(Object element){
		_element=element;
	}
	public Object getElement() {
		return _element;
	}
	public void setElement(Object e) {
		_element=e;
	}
	public abstract Noeud suivant();
	public abstract void setSuivant(Noeud ns);
	public String toString(){
		return this.getClass()+"("+_element.getClass()+": "+_element+")";
	}
}
