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
	
}
