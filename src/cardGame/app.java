package cardGame;

public class app {
	
	public static void main(String[] args) {

		System.out.println("Let's Play War!");
		System.out.println("First, shuffle the deck.");
		System.out.println("---------------------------");
		
		//instantiate a deck
		deck d1 = new deck();
		
		//shuffle the deck
		d1.shuffle();
		
		//describe the deck
		d1.describe();
		
		//create two players
		player player1 = new player();
		player player2 = new player();
		
		player1.setName("Player1");
		player2.setName("Player2");
		
		//Using a traditional for loop, iterate 52 times calling the 
		//draw method on the other player each iteration using the Deck 
		//you instantiated.
		for (int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.drawCard(d1);
			} else {
				player2.drawCard(d1);
			}
		}		
		
		//Compare the value of each card returned by the two players' flip 
		//methods. Call the incrementScore method on the player whose card 
		//has the higher value. Print a message to say which player 
		//received a point.
	    //Note:  If the values are equal (it is a tie), print a message 
		//saying that no point was awarded.
		int round = 1;
		for (int i = 0; i <26; i++) {
			System.out.println("----------------------------");
			System.out.println("------ Round "+ round + " of 26:------");
			round++;
			card c1 = player1.flip();
			card c2 = player2.flip();
			
			
			System.out.println(player1.getName() + " plays " + c1.cardDescription());
			System.out.println(player2.getName() + " plays " + c2.cardDescription());
			//System.out.println(player1.getName() + " plays: " + c1.describe());
			//System.out.println(player2.getName() + " plays: " + c2.describe());
			
			if (c1.getValue() > c2.getValue()) {
				System.out.println("Player 1 Wins the Match!");
				player1.incrementScore();
			} else if (c2.getValue() > c1.getValue()){
				System.out.println("Player 2 Wins the Match!");
				player2.incrementScore();
			} else {
				System.out.println("No winner--it's a Draw!");
			}				
		}
		//round up and print the results
		System.out.println("----------------------------");
		System.out.println("------Final Tally:------");
		System.out.println("Player 1 Final Score: "+player1.getScore());
		System.out.println("Player 2 Final Score: "+player2.getScore());
		if (player1.getScore() > player2.getScore()){
			System.out.println("Player 1 Wins the Game!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 Wins the Game!");
		} else {
			System.out.println("This Game is a Draw!");
		}
	}

}
