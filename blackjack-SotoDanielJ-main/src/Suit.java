/**
 * This will contain the Suit value
 * Heart, Spade, Club, Diamond
 */
public enum Suit {

    HEART("Hearts"),
    DIAMOND("Diamonds"),
    SPADE("Spades"),
    CLUB("Clubs");

    String suitName;

    Suit(String suitName){
        this.suitName = suitName;
    }
    public String toString(){
        return suitName;
    }
    
}
