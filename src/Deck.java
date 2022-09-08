

import java.util.Collections;
import java.util.LinkedList;


public class Deck {
	
	//Attributes
	public static LinkedList<Card> deck = new LinkedList<Card>();
	
	//Constructors
	public Deck () {};
		
	
	//Methods
		
		//CreateTheDeck suits & values
		public static LinkedList<Card> createDeck(){
		
			for (int i=2;i<=14;i++) {
				for (int j=0; j<=3; j++) {
//					System.out.println("value " + i + " suit " + j );
//					Card card = new Card();
//					card.setValue(i);
//					card.setSuitNum(j);
//					card.finishUp();
					
					Card card = new Card(i,j);
					deck.add(card);
					
					if(App.debug) {
						System.out.println(card.getName());
						System.out.println(deck.size());
						for (int a=0; (a < deck.size()); a++) { System.out.print(a + " "); System.out.println(deck.get(a).getName()); }
						System.out.println();
					}
				}
					
			}
			
			System.out.println("Shuffling...............");
			System.out.println("");
			
			Collections.shuffle(deck);
			
			if(App.debug) {
				for (Card cardx : deck) { System.out.println(cardx.getName()); }
			}
			
			return deck;
		}


}
	