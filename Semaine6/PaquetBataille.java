public class PaquetBataille extends Paquet {
	private String name;

	public boolean greaterThan(Card card1, Card card2){
		return true;
	}

	public PaquetBataille(String name){
		String tab [] = {"7","8","9","10","V","D","R","A"};
        Hauteurs hauteurs = new Hauteurs(tab);
        Symbol trefle = new Symbol("trefle","noir");
        Symbol carreau = new Symbol("carreau","rouge");
        Symbol coeur = new Symbol("coeur","rouge");
        Symbol pique = new Symbol("pique","noir");
        Symbol symboles [] = {trefle, carreau, coeur, pique};
        creePaquet(hauteurs, symboles);
 		this.name = name;
	}

	public static void main(String args[]){
		PaquetBataille monPaquet = new PaquetBataille("Mon paquet");
		System.out.println(monPaquet);
		monPaquet.shuffle();
		System.out.println(monPaquet);
	}
}