import java.util.ArrayList;


public class Hand {
	//instance variables
	ArrayList<Integer> cardList = new ArrayList<Integer>(5);
	
	//Constructor
	public Hand(){
		
	}
	
	//Methods
	public ArrayList<Integer> getCardList(){
		return cardList;
	}
	
	public void setCardList(ArrayList<Integer> cardList){
		this.cardList = cardList;
	}
	
	//Add cards to hand
	public void addToHand(ArrayList<Integer> cards){
		int length = cards.size();
		for(int i = 0; i<length; i++){
			cardList.add(cards.get(i));
		}
		
	}
	
}
