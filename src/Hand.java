import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
	private List<Card> cards;
	int sum = 0;
	
	public Hand() {
		this.cards = new ArrayList<>();
	}
	
	public void add(Card card) {
		this.cards.add(card);
		this.sum += card.getValue();
	}
	
	public void print() {
		Iterator<Card> iterator = cards.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void sort() {
		Comparator<Card> comparator = Comparator
				.comparing(Card::getValue)
				.thenComparing(Card::getSuit);
		
		Collections.sort(cards, comparator);
	}
	
	@Override
	public int compareTo(Hand hand) {
		
		if (this.sum > hand.sum) {
			return 1;
		} else if (this.sum == hand.sum) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public void sortBySuit() {
		Comparator<Card> comparator = Comparator
				.comparing(Card::getSuit)
				.thenComparing(Card::getValue);
		
		Collections.sort(cards, comparator);
	}
}
