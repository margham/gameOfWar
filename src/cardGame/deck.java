package cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deck {
	List<card> cards = new ArrayList<card>();
	
	deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
				"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for(String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				card card = new card(number, suit, count);
				this.cards.add(card);
				count++;
			}
		}
	}
	
	public List<card> getCards() {
		return cards;
	}
	
	public void setCards(List<card> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for (card card : this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public card draw() {
		card card = this.cards.remove(0);
		return card;
	}
}

