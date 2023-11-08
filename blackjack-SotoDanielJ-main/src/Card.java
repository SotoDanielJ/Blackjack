/**
 * This class will contain one card
 * CardValue 2-10 Jack, Queen, King, Ace
 * Suit Heart, Club, Spade, Diamond
 */
public class Card {

    private Suit suit;
    private CardValue cardValue;

    public Card(Suit suit, CardValue cardValue){
        this.suit = suit;
        this.cardValue = cardValue;
    }

    /**
     * copy of drawn card
     * @param card
     */
    public Card(Card card) {
        this.suit = card.getSuit();
        this.cardValue = card.getCardValue();
    }

    public int getValue(){
        return cardValue.cardValueValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }
    
    public String toString(){
        return ("[" + cardValue + " of " + suit + "] - " + this.getCardValue());
    }
}
