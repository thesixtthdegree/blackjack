import java.util.ArrayList;
import java.util.Random;


public class Deck {
	//instance variables
	ArrayList<Integer> cardList = new ArrayList<Integer>(52);
	int position;
	Random rand = new Random();
	
	
	//Constructor
	public Deck(){
		//Fill deck with numbers 1-52 in order
		for(int i = 0; i<52; i++){
			cardList.add(i, i+1);
		}
		shuffle();
		position = 0;
	}
	
	
	//Get
	public ArrayList<Integer> getCardList(){
		return cardList;
	}
	
	public int getPosition(){
		return position;
	}
	
	
	//Set
	
	//Shuffle deck using Fisher-Yates shuffle algorithm
	public void shuffle(){
		int j;
		int temp;
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
	public ArrayList<Integer> pick(int n){
		ArrayList<Integer> cardsToPick = new ArrayList<Integer>(n);
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
