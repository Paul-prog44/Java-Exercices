import java.util.Comparator;

public class Card implements Comparable<Card> {
	private int value;
	private Suit suit;
	
	public Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		return this.suit + " " + this.value;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public int getValue() {
		return this.value;
	}
	
	@Override
	public int compareTo(Card card) {
		Comparator<Card> comparator = Comparator
				.comparing(Card::getValue)
				.thenComparing(Card::getSuit);
		return 1;
	}
}
