public class NoeudSimple extends Noeud {
private NoeudSimple _suivant;
public NoeudSimple(Object element) {
super(element);
_suivant=null;
}
@Override
public Noeud suivant() {
return _suivant;
}
@Override
public void setSuivant( Noeud ns ) {
_suivant=(NoeudSimple)ns;
}
}