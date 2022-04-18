/**
 * This is a class that tests the Card class.
 */
public class Main {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
  {
		//create cards
    Card n1 = new Card("7", "Spade", 7);
    Card n2 = new Card("Queen", "Diamond", 12);
    Card n3 = new Card("3", "Club", 3);

    System.out.println("Card 1 Rank: " + n1.rank());
    System.out.println("Card 1 Suit: " + n1.suit());
    System.out.println("Card 1 Point Value: " + n1.pointValue());
    System.out.println("Card 1 toString: " + n1);

    System.out.println();

    System.out.println("Card 2 Rank: " + n2.rank());
    System.out.println("Card 2 Suit: " + n2.suit());
    System.out.println("Card 2 Point Value: " + n2.pointValue());
    System.out.println("Card 2 toString: " + n2);

    System.out.println();

    System.out.println("Card 3 Rank: " + n3.rank());
    System.out.println("Card 3 Suit: " + n3.suit());
    System.out.println("Card 3 Point Value: " + n3.pointValue());
    System.out.println("Card 3 toString: " + n3);

    System.out.println();

    System.out.println("Card 1 and Card 2 match: " + n1.matches(n2));
    System.out.println("Card 1 and Card 3 match: " + n1.matches(n3));
    System.out.println("Card 2 and Card 3 match: " + n2.matches(n3));

	}
}
