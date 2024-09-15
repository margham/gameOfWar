package cardGame;

public class card {
/*
 * fields
 */
	String name;
	String suit;
	int value;
	
/*
 * constructor
 */
	card(String name, String suit, int value){
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
/*
 * getters and setters
 */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
/* 
 * public methods
 */
	public void describe() {
		System.out.println(this.name + " of " + this.suit + " --- " + this.value);
	}
	
	public String cardDescription() {
		String cardName = (this.name + " of " + this.suit);
		return cardName;
	}
}

