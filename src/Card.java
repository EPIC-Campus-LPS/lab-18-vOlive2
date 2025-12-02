public class Card {
	private String suit;
	private String rank;
	private int value;
	public Card(String s, int v) {
		suit = s;
		value = v;
		rank = ""+v;
		if (value == 11) rank = "Jack";
		if (value == 12) rank = "Queen";
		if (value == 13) rank = "King";
	}
	public String getSuit() {return suit;}
	public String getRank() {return rank;}
	public int getValue() {return value;}
	public void setSuit(String s) {suit = s;}
	public void setRank(String r) {rank = r;}
	public void setSuiti(int v) {value= v;}
	@Override public String toString() {return rank+" of "+suit;}
}
