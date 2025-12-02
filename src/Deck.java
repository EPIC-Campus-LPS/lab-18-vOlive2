import java.util.ArrayList;
import java.util.Collections;
public class Deck {
	ArrayList<Card> cards = new ArrayList<>();
	public Deck() {
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		for(String s : suits) {
			for(int i = 1; i <= 13; i++) {
				cards.add(new Card(s, i));
			}
		}
	}
	public void shuffle() {Collections.shuffle(cards);}
	public Card drawCard() {
		Card card = null;
		if(cards.size() > 0) {
			card = new Card(cards.get(0).getSuit(),cards.get(0).getValue()); 
			cards.remove(0); 
		}
		return card;
	}
	//@Override public String toString() {return rank+" of "+suit;}
}

