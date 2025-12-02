import java.util.ArrayList;

public class Player {
	private String name;
	private int score = 0;
	private ArrayList<Card> hand = new ArrayList<>();
	Player(String n) {
		name = n;
	}
	private void sortHand() {
		for(int i = 1; i < hand.size(); i++) {
			Card save1 = new Card(hand.get(i).getSuit(), hand.get(i).getValue());
			Card save2 = save1;
			for(int j = 0; j <= i; j++) {
				if(hand.get(j).getValue() < save1.getValue()){
					save2 = new Card(hand.get(j).getSuit(), hand.get(j).getValue());
					hand.set(j, save1);
					save1 = save2;
				}
				if(i==j) {hand.set(i, save2);}
			}
		}
	}
	public void draw(Deck deck) {hand.add(deck.drawCard());}
	public void drawStartingHand(Deck deck) {for(int i = 0; i != 5; i++) {hand.add(deck.drawCard());}}
	public Card playCard() {Card x = hand.get(0); hand.remove(0); return x;}
	public void addPoint() {score++;}
	public int getScore() {return score;}
	
}
