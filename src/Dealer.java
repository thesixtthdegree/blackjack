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
	

	//deal one card to the player
	public void dealToPlayer(Player player)
	{
		Hand playerHand = player.getHand();
		playerHand.addToHand(deck.pick());
		player.setHand(playerHand);
	}
	
	
	//deal one card to it self (dealer)
	public void dealToDealer()
	{
		hand.addToHand(deck.pick());
	}
		
	
	
}
	
	
	