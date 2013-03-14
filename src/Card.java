public class Card 
{
  
	private String suit;
	private int value;
	private String face;
	
	public Card(int n)
	{
		makeCard(n);
	}
	
	//set methods
	public void setSuit(String s)
	{
		suit = s;
	}
	
	public void setValue(int v)
	{
		value = v;
	}
	
	public void setFace(String f)
	{
		face = f;
	}
	
	//get methods
	public String getSuit()
	{
		return suit;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getFace()
	{
		return face;
	}
	
	//determines cards variables based on the int provided
	public void makeCard(int n)
	{
		if(n >= 13 && n < 26)
		{
			suit = "Spades";
			n -= 13;
		}
		else if(n >= 26 && n < 39)
		{
			suit = "Clubs";
			n -= 26;
		}
		else if(n >= 39 && n < 52)
		{
			suit = "Hearts";
			n -= 39;
		}
		else
		{
			suit = "Diamonds";
		}
		determineType(n);
	}
	
	//assigns the card a value and face.
	private void determineType(int n)
	{
		if(n < 10)
			value = (n+1);
		else
			value = 10;
		
		if(n==0)
			face = "A";
		else if(n < 10)
			face = ""+(n+1);
		else if(n==10)
			face = "J";
		else if(n==11)
			face = "Q";
		else if(n==12)
			face = "K";
		else
			System.out.println("int too high for card");
		
	}
	
	//raises the value of the ace to 11.
	public void raiseAce()
	{
		if(value == 1)
			value = 11;
	}
	
	//lowers value of the ace to 1.
	public void lowerAce()
	{
		if(value == 11)
			value = 1;
	}
	
	//toString
	public String toString()
	{
		return face+" of "+suit+" Value:"+ value;
	}
 
}