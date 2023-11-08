import java.util.ArrayList;

/**
 * This class will contain the the playing deck
 * Makes a brand new deck with 52 cards, 13 cards of each suit
 */
public class Deck {

    private ArrayList<Card> deck;

    //creates deck (empty)
    public Deck(){
        deck = new ArrayList<Card>();
    }
    
    //adds card to deck
    public void addCard(Card card){
        deck.add(card);
    }

    //string with all cards
    public String toString(){
        String output = "";

        //for each "card"
        for(Card card : deck){
            //adds card and new line
            output += card;
            output += "\n";
        }
        return output;
    }

    //create deck with 52 cards
    public Deck(boolean makeDeck){
        deck = new ArrayList<Card>();
        if(makeDeck){
            //suits
            for(Suit suit : Suit.values()){
                //card values
                for(CardValue cardValue : CardValue.values()){
                    deck.add(new Card(suit, cardValue));
                }
            }
        }
    }

    //shuffle cards
    public void shuffle(){
        ArrayList<Card> shuffled = new ArrayList<Card>();
        //go through all cards
        while(deck.size() > 0){
            //pull random card
            int cardPull = (int)(Math.random()*(deck.size()-1));
                //add pulled card to shuffled deck
                shuffled.add(deck.get(cardPull));
                //remove pulled card from original ArrayList
                deck.remove(cardPull);
        }
        //complete shuffle
        deck = shuffled;
    }

    //draw top card from deck
    public Card drawCard() {
        Card drawnCard = new Card(deck.get(0));
            //remove drawn card from deck
            deck.remove(0);
            //send card to hand
            return drawnCard;
    }

    //check for cards
    public boolean hasCards(){
        if(deck.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    //empty out deck
    public void emptyDeck(){
        deck.clear();
    }

    /**
     * @param cards arraylist of cards to be added to this deck
     */
    public void addCards(ArrayList<Card> cards){
        deck.addAll(cards);
    }

    //take cards from discarded deck
    //place in this deck, shuffled
    public void reloadFromDiscard(Deck discard){
        this.addCards(discard.getCards());
        this.shuffle();
        discard.emptyDeck();
        System.out.println("Ran out of cards, creating new deck from discard pile & shuffling...");

    }
    //quick fix for "getCards" above
    private ArrayList<Card> getCards() {
        return null;
    }
    //how many cards left in deck
    public int cardsLeft() {
        return deck.size();
    }
} 
