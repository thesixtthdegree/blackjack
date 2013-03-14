import java.util.ArrayList;
import java.util.Random;


public class Deck {
	//instance variables
	ArrayList<Card> cardList = new ArrayList<Card>(52);
	int position;
	Random rand = new Random();
	
	
	//Constructor
	public Deck(){
		//Fill deck with cards from 0-51
		for(int i = 0; i<52; i++){
			Card card = new Card(i);
			cardList.add(i, card);
		}
		shuffle();
		position = 0;
	}
	
	
	//Get
	public ArrayList<Card> getCardList(){
		return cardList;
	}
	
	public int getPosition(){
		return position;
	}
	
	
	//Set
	
	//Shuffle deck using Fisher-Yates shuffle algorithm
	public void shuffle(){
		int j;
		Card temp;
		for(int i = 51; i>=0; i--){
			temp = cardList.get(i);
			
			//Generate Random Index
			j = rand.nextInt(52);
			
			//Exchange cards
			cardList.set(i, cardList.get(j));
			cardList.set(j, temp);
			
		}
		
		
	}
	
	
	//Pick up cards from the deck
	public ArrayList<Card> pick(int n){
		ArrayList<Card> cardsToPick = new ArrayList<Card>(n);
		for(int i = 0; i<n; i++){
			cardsToPick.add(i, cardList.get(position));
			position++;
		}
		return cardsToPick;
	}
	
	
	//toString
	public String toString(){
		String result = "Card List:\n";
		for(int i = 0; i<52; i++){
			result += cardList.get(i);
			result += "\n";
		}
		return result;
	}
	
}
