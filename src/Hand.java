import java.util.ArrayList;


public class Hand {
	//instance variables
	ArrayList<Card> cardList;
	
	//Constructor
	public Hand(){
		int startSize = 5;
		cardList = new ArrayList<Card>(startSize);
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
	
	//Draws the hand
	public void drawHand(){
		//for each row
		for(int i = 0; i<17; i++){ //cardList.get(0).drawCard().size()
			
			//for each card
			for(int j = 0; j<cardList.size(); j++){
				System.out.print(cardList.get(j).drawCardLine(i));
			}
			
			//New line
			System.out.print("\n");
			
		}
	}
	
}
