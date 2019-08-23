/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) 
    {
        Card card1 = new Card(Rank.ACE, Suit.SPADES);
        Card card2 = new Card(Rank.ACE, Suit.HEARTS);
        Card card3 = new Card(Rank.ACE, Suit.SPADES);
        
        System.out.println(card1);
        System.out.println(card2.suit().toString() + card2.rank() + card2.pointValue());
        System.out.println(card1.matches(card2));
        System.out.println(card1.matches(card3));
    }
}
