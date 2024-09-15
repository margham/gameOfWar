package cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class player {

	/*
	 * fields
	 * List<card> cards = new ArrayList<card>();
	 */
	List<card> hand = new ArrayList<card>();
	int score;
	String name;
	/*
	 * constructor
	 */
	public player(){};
	
	player(String name, int score, List<card> hand){
		this.name = name;
		this.score = 0;
		this.hand = hand;
	}
	/*
	 * methods
	*/
	public void describePlayer() {
		System.out.println("Player: "+ name);
		System.out.println("Score: "+ score);
		for (card card : this.hand) {
			card.describe();
		}
	}
	
	public card flip(){
		card card = this.hand.remove(0);
		return card;
	}
	
	/*
	 * public card draw() {
		card card = this.cards.remove(0);
		return card;
	}
	 */
	public void drawCard(deck deck){
		hand.add(deck.draw());
	}
	
	public void incrementScore(){
		score++;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
