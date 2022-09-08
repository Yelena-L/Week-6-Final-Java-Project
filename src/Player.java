

import java.util.LinkedList;

public class Player {

	
	//Attributes
	
		private String name = "";
		private int score = 0;
		private LinkedList<Card> hand = new LinkedList<Card>();
	
	//Constructors
		
		public Player() {}
		
		public Player(String inName) {
			this.name = inName;
		}


	//Methods
	
			//add a card to the hand
			public void addACard(Card card) { this.hand.add(card);}
		
			//take a card off the hand
			public Card getACard() { 
				Card nextCard = this.hand.getFirst();
				this.hand.removeFirst();
				return nextCard; 
			}
		
			//print out hand
			public void showPlayerHand() {
				//List<Card> answer = new LinkedList<Card>();
				//Loop through hand
				for(int i = 0; i < hand.size(); i++){
					String next = hand.get(i).getName();
				    System.out.println(next);
				}
			}
	
			//print out player info
			public void showPlayerInfo() {
				String playerInfo = "Name " + name + " Score " + score; 
				System.out.println(playerInfo);
			}
	
			
			
	//Getters & Setters
			
		public String getName() {
			return name;
		}

		public void setName(String name) { //validate strings
			this.name = name;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) { //validatee?
			App.ValidateInt();
			this.score = score;
		}

		public LinkedList<Card> getHand() {
			return hand;
		}

		public void setHand(LinkedList<Card> hand) { //validate?
			this.hand = hand;
		}
	
}
