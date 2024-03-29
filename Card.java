/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

    /**
     * String value that holds the suit of the card
     */
    private Suit suit;

    /**
     * String value that holds the rank of the card
     */
    private Rank rank;

    /**
     * int value that holds the point value.
     */


    /**
     * Creates a new <code>Card</code> instance.
     *
     * @param cardRank  a <code>Rank</code> value
     *                  containing the rank of the card
     * @param cardSuit  a <code>Suit</code> value
     *                  containing the suit of the card
     * @param cardPointValue an <code>int</code> value
     *                  containing the point value of the card
     */
    public Card(Rank cardRank, Suit cardSuit) 
    {
        suit = cardSuit;
        rank = cardRank;
    }


    /**
     * Accesses this <code>Card's</code> suit.
     * @return this <code>Card's</code> suit.
     */
    public Suit suit() 
    {
        return suit;
    }

    /**
     * Accesses this <code>Card's</code> rank.
     * @return this <code>Card's</code> rank.
     */
    public Rank rank() 
    {
        return rank;
    }

    /**
     * Accesses this <code>Card's</code> point value.
     * @return this <code>Card's</code> point value.
     */
    public int pointValue() 
    {
        return rank.getValue();
    }

    /** Compare this card with the argument.
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
     */
    public boolean matches(Card otherCard) 
    {
        return rank.equals(otherCard.rank) && suit.equals(otherCard.suit);
    }

    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (point value = [PointValue])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     *         and point value of the card.
     */
    @Override
    public String toString() {
        return rank.toString() + " of " + suit.toString() + "(point value = " + rank.getValue() + ")";
    }
}
