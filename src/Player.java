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
	
	//bet method
	public void bet(int amount, Dealer dealer){
		money -= amount;
		dealer.acceptBetFrom(amount);
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
	
	//double method
	public void doubleBet(Dealer dealer){
		bet(dealer.getPot() / 2);
		hit(dealer);
	}
	
	//get player's hand value
	public int getHandValue(){
		hand.getValue();
	}
	
	/*surrender method(Possible)
	public void surrender(){
		
	}*/
	
}
