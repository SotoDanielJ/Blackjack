/**
 * This class will contain the value
 * An Ace will either be a 1 = 11
 * King, Queen, Jack will be 10
 * Other card will be face value
 */
public enum CardValue {
    
    ACE("Ace", 11),
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four",4),
    FIVE("Five",5),
    SIX("Six",6),
    SEVEN("Seven",7),
    EIGHT("Eight",8),
    NINE("Nine",9),
    TEN("Ten",10),
    JACK("Jack",10),
    QUEEN("Queen",10),
    KING("King",10);

    String cardValueName;
    int cardValueValue;

    CardValue(String cardValueName, int cardValueValue){
        this.cardValueName = cardValueName;
        this.cardValueValue = cardValueValue;
    }

    public String toString(){
        return cardValueName;
    }
}
