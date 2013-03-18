import java.util.*;
public abstract class Paquet implements Comparable, Shufflable{
	private Symbol symbols[];
	private Card cards [];

	private Hauteurs hauteurs;

	public void shuffle(){
		Random generator = new Random();
		for (int i=0; i<cards.length; i++) {
			int randomPosition = generator.nextInt(cards.length);
    		Card temp = cards[i];
    		cards[i] = cards[randomPosition];
    		cards[randomPosition] = temp;
    	}
    }

	public void cut(){
		Random generator = new Random();
		int cutPosition = generator.nextInt(cards.length);
		Card tmp[] = new Card[cards.length];
		for (int i=cutPosition; i<cards.length; i++)
			tmp[i-cutPosition] = cards[i];
		for (int i=0; i<cutPosition; i++)
			tmp[i-cutPosition+cards.length] = cards[i];
	}
}