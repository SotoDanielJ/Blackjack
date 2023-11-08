/**
 * This abstract class will contain the logic 
 * of a blackjack player, either casino patron or the dealer.
 */
public abstract class Player {
    
    private Hand hand;
    private String name;

    //player constructor
    public Player(){
        this.hand = new Hand();
        this.name = "";
    }

    //check for Blackjack
    public boolean hasBlackjack(){
        if(this.getHand().calculateHand() == 21){
            return true;
        }
        else{
            return false;
        }
    }

    //print hand
    public void printHand(){
    System.out.println(this.name + "'s hand: " + this.hand);
    System.out.println("Valued at: " + this.hand.calculateHand());
    }

    //hit
    public void hit(Deck deck, Deck discard){

        //if no cards left in the deck
        if(!deck.hasCards()){
            deck.reloadFromDiscard(discard);
        }
        this.hand.draw(deck);
        System.out.println(this.name + " gets a card.");
        this.printHand();

    }

// getters (with "this.") and setters
    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
