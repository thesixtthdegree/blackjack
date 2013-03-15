
public class BlackjackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Test the deck
		Deck deck1 = new Deck();
		System.out.println(deck1);
		Hand hand1 = new Hand();
		hand1.setCardList(deck1.pick(3));
		System.out.println(hand1.getCardList());
		System.out.println(deck1.getPosition());
		hand1.addToHand(deck1.pick(3));
		System.out.println(hand1.getCardList());
		System.out.println(deck1.getPosition());
		System.out.println(hand1.getValue());
		hand1.drawHand();
	}

}
