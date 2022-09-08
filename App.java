package cardGameWar1;


public class App {

	 public static final boolean debug = false;
		
     public static final boolean debug2 = true;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Global Settings
		//Test Data
		final String name1 = "Pat";
		//public static String name2 = "Chris";
		
		
		
		//Ask type of game Batch-B, Interactive-I, Dice-D, Quit-I
		//Scanner gameType
		
		
		//Create Players with a scanner input for name
		Player player1 = new Player(name1);
		Player player2 = new Player("Chris");
		
		
		//Create, Shuffle a new deck
		Deck.createDeck();
		
		
		//Deal cards to players with loop
				//for (Card card : Deck.deck) {}
				//Card card = Deck.deck.get(0);
		for (int i=0; i<Deck.deck.size(); i=i+2) {
			Card card1 = Deck.deck.get(i);
			player1.addACard(card1);
			Card card2 = Deck.deck.get(i+1);
			player2.addACard(card2);
		}
		//list players hands to debug
		if(debug) {
			System.out.println();
			System.out.println("player1.hand");
			player1.showPlayerHand();
			System.out.println();
			System.out.println("player2.hand");
			player2.showPlayerHand();
		}
		System.out.println();
		
		//Play hands, determine winner and add score
		boolean cardsLeft = true;
		while(cardsLeft) {
			try 
			{
				Card cardP1 = player1.getACard();
				Card cardP2 = player2.getACard();
				System.out.println("player1= " + cardP1.getName() + " player2= " + cardP2.getName());
			
				if (cardP1.getValue() > cardP2.getValue()) 
				{ 
					System.out.println("Winner of hand is Player1 " + player1.getName());
					player1.setScore(player1.getScore() + 1); 
				}
				else if(cardP1.getValue() < cardP2.getValue())
				{
					System.out.println("Winner of hand is Player2 " + player2.getName());
					player2.setScore(player2.getScore() + 1); 
				}
				else 
				{
					System.out.println("Tie hand, no winner ");
				}
				System.out.println();
			}
			catch(Exception e)
			{
				cardsLeft = false;
			}
		}
		
	
		//At end, save & print names and scores, and declare winner
		System.out.println("1 = " + player1.getScore() + " 2 = " + player2.getScore());
		if (player1.getScore() > player2.getScore()) 
		{ 
			System.out.println("Winner of game is Player1 " + player1.getName());
		}
		else if(player1.getScore() < player2.getScore())
		{
			System.out.println("Winner of game is Player2 " + player2.getName());
		}
		else 
		{
			System.out.println("Tie game, no winner ");
		}
		System.out.println();
	}
	
	
	//save or log winner
	
		
	//Print stats for all games
		
	//Ask if another game Ok? Batch, Interactive, Dice, Quit 
	
	
	//==============================================
	
	//Standard Validations
			public static Boolean ValidateInt() {
				Boolean ok = false;
				
				
				return ok;
			}
		
}
