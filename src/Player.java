import java.util.ArrayList;

public class Player{
	
	//instance variables
	private String name;
	private int money;
	private Hand hand;
	
	//constructors
	
	//initializes starting money without player input
	public Player(String n){
		name = n;
		money = 50000;
		hand = new Hand();
	}
	
	//initializes starting money WITH player input
	public Player(String n, int m){
		name = n;
		money = m;
		hand = new Hand();
	}
	
	//get & set methods
	public String getName(){
		return name;
	}
	
	public int getMoney(){
		return money;
	}
	
	public Hand getHand(){
		return hand;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setMoney(int m){
		money = m;
	}
	
	//remove money
	public void removeAmount(int amount){
		money -= amount;		
	}
	
	//add money
	public void addAmount(int amount){
		money += amount;
	}
	
	//deal method
	public void deal(Deck deck){
		ArrayList<Card> cardList = deck.pick(2);
		hand.setCardList(cardList);
	}
	
	//hit method
	public void hit(Dealer dealer){
		dealer.dealToPlayer(this);
	}
	
	//get player's hand value
	public int getHandValue(){
		return hand.getValue();
	}
	
	//blackjack?
	public boolean isBlackJack(){
		return(this.getHandValue() == 21);
	}
	
	//bust?
	public boolean isBust(){
		return(this.getHandValue() > 21);
	}
}
