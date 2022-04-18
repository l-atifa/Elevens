/**
 * This is a class that tests the Deck class.
 */
public class Main {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
  {
    String[] r1 = {"2", "4", "6", "8", "10"};
    String[] s1 = {"spades", "clubs"};
    int[] pv1 = {2, 4, 6, 8, 10};
		Deck d1 = new Deck(r1, s1, pv1);

    String[] r2 = {"1", "3", "5", "7", "9"};
    String[] s2 = {"diamonds", "hearts"};
    int[] pv2 = {1, 3, 5, 7, 9};
    Deck d2 = new Deck(r2, s2, pv2);

    String[] r3 = {"2", "3", "8", "9"};
    String[] s3 = {"hearts","spades", "diamonds"};
    int[] pv3 = {2, 3, 8, 9};
    Deck d3 = new Deck(r3, s3, pv3);

    System.out.println("Deck 1");
    System.out.println(d1);
    d1.deal();
    System.out.println(d1);

    System.out.println();
    System.out.println();
    
    System.out.println("Deck 2");
    d2.deal();
    d2.deal();
    d2.deal();
    d2.deal();
    d2.deal();
    d2.deal();
    d2.deal();
    d2.deal();
    d2.deal();
    d2.deal();
    System.out.print(d2);
    System.out.println("Deck 2 is empty: " + d2.isEmpty());

    System.out.println();
    System.out.println();
    System.out.println();
    
    System.out.println("Deck 3");
    System.out.println("Size of Deck 3 before deal: " + d3.size());
    d3.deal();
    System.out.println(d3);
	}
}
