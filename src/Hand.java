import java.util.ArrayList;


public class Hand {
	//instance variables
	ArrayList<Card> cardList = new ArrayList<Card>(5);
	
	//Constructor
	public Hand(){
		
	}
	
	//Methods
	public ArrayList<Card> getCardList(){
		return cardList;
	}
	
	public void setCardList(ArrayList<Card> cardList){
		this.cardList = cardList;
	}
	
	//Add cards to hand
	public void addToHand(ArrayList<Card> cards){
		int length = cards.size();
		for(int i = 0; i<length; i++){
			cardList.add(cards.get(i));
		}
		
	}
	
	//Return the value of the hand
	public int getValue(){
		int sum = 0;
		for(int i=0; i<cardList.size(); i++){
			sum += cardList.get(i).getValue();
		}
		
		return sum;
	}
	
}
