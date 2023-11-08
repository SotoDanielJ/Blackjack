import java.util.ArrayList;

public class Hand {
    
    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }

    //draw from deck
    public void draw(Deck deck){
        hand.add(deck.drawCard());
    }

    //print player or dealer's hand
    public String toString(){
        String output = "";
        for(Card card : hand){
            output += card + " - ";
        }
        return output;
    }

    //calculate hand value
    public int calculateHand(){
        //count aces and total hand value
        int aces = 0;
        int value = 0;

        //each card in hand
        for(Card card : hand){
            //add value to hand
            value += card.getValue();
            //count any aces added
            if(card.getValue() == 11){
                aces++;
            }
        }

        //if we have multiple aces
        //we go set each ace to 1 until total value is under 21
        //if it can be
        if(value > 21 && aces > 0){
            while(aces > 0 && value > 21){
            aces--;
            value -= 10;
            }
        }
        return value;
    }

    //to get 1st card from dealer's hand
    public Card getCard(int idx){
        return hand.get(idx);
    }

    public void discardHand(Deck discardDeck) {

        //copy cards from hand to discard
        discardDeck.addCards(hand);

        //clear hand
        hand.clear();

    }
}
