


//information about class
public class Card {

	//Attributes
	private int suitNum = 0;
	private int value = 0;
	
	private Suit suit = null;
	private Face face = null;
	private String name = "";
	
	
	
	//Constructors
	public Card() {}
	
	public Card(int value, int suitNum) {
		this.value = value;
		this.suitNum = suitNum;
		finishUp();
	}

	
	//Methods
	
	public void finishUp() {
		int x = this.suitNum;
		int y = this.value;
		
		//convert suitNum to suit
		Suit a = Suit.get(x);
		
		//convert value to face
		Face b = Face.get(y);
		
		
		//make the name
		String z = b + " of " + a + "S";
		
		this.suit = a;
		this.face = b;
		this.name = z;
	}
	
	
	//https://stackoverflow.com/questions/609860/convert-from-enum-ordinal-to-enum-type
	
	enum Suit {HEART, DIAMOND, SPADE, CLUB;     
		public static Suit get(int index){
	        return Suit.values()[index];
		}
	}
	
	public enum Face {Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nime, Ten, Jack, Queen, King, Ace; 
		public static Face get(int index){
	        return Face.values()[index];
		}
	}

	
	//Getters & Setters
	
	public int getSuitNum() {
		return suitNum;
	}

	public void setSuitNum(int suitNum) {
		this.suitNum = suitNum;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Face getFace() {
		return face;
	}

	public void setFace(Face face) {
		this.face = face;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	}
	
