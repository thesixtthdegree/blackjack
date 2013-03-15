import java.util.ArrayList;



public class Dealer extends Player
{
	private Hand hand; //the dealers hand
	private Deck deck; //the deck the dealer deals from
	
	
	//constructor	
	public Dealer()
	{
		deck = new Deck(); //start deck object
		hand = new Hand(); //start with empty hand object
	}
	

	
	//sets the number of cards to deal
	public ArrayList<Card> deal(int n)
	{
		return deck.pick(n);
		
	}
	//deal cards to the player based on number of cards to deal
	public void deal(int n, Player player)
	{
		Hand playerHand = player.getHand();
		playerHand.addToHand(deck.pick(n));
		player.setHand(playerHand);
	}
	
		
	
	
}
	
	
	