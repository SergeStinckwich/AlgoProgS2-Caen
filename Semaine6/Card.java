public class Card extends AbstractCard{
	private String hauteur;
	private Symbol symbol;

	public String getHauteur(){
		return hauteur;
	}

	public Symbol getSymbol(){
		return symbol;
	}

	public Card(String hauteur, Symbol symbol){
		this.hauteur = hauteur;
		this.symbol = symbol;
	}

	public String toString(){
		return
			this.getHauteur()
			+ " de "
			+ this.getSymbol().getName();
	}

}