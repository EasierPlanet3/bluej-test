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
        Card card1 = new Card("Ace", Suit.SPADES, 11);
        Card card2 = new Card("Ace", Suit.HEARTS, 11);
        Card card3 = new Card("Ace", Suit.SPADES, 11);
        
        System.out.println(card1);
        System.out.println(card2.suit() + card2.rank() + card2.pointValue());
        System.out.println(card1.matches(card2));
        System.out.println(card1.matches(card3));
    }
}
