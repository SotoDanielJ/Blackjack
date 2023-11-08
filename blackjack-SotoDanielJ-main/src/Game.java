/**
 * This class will play the Game
 */
public class Game {

   //game variables
   private Deck deck;
   private Deck discarded;
   //player variables
   private Dealer dealer;
   private Patron patron;
   //score variables
   private int wins;
   private int losses;
   private int rounds;

   public void Play(){

      System.out.println("Let's play Blackjack!");

      //set score to 0
      wins = 0;
      losses = 0;

      //new 52 card deck
      deck = new Deck(true);
      //empty deck
      discarded = new Deck();

      //Players
      dealer = new Dealer();
      patron = new Patron();

      //shuffle
      deck.shuffle();

      //start
      startRound();

   }

   private void startRound() {

      //ensure hands discard after round
      //announce score
      //ensure deck reloads
      if(wins > 0 || losses > 0 || rounds > 0){
         System.out.println("\n\nStarting next round...\n\nWins: " + wins + "\n\nLosses: " + losses + "\n\nRounds: " + rounds);
            dealer.getHand().discardHand(discarded);
            patron.getHand().discardHand(discarded);
      }

      //check deck has atleast 4 cards
      if(deck.cardsLeft() < 4){
         deck.reloadFromDiscard(discarded);
      }

      //dealer draws 2
      dealer.getHand().draw(deck);
      dealer.getHand().draw(deck);

      //patron draws 2
      patron.getHand().draw(deck);
      patron.getHand().draw(deck);

      //print hands
      dealer.printFirst();
      patron.printHand();

      //check blackjack for dealer @ start
      if(dealer.hasBlackjack()){
         //show dealer's hand
         dealer.printHand();

         //check for patron
         if(patron.hasBlackjack()){
            //end round and start new round
            System.out.println("You both have 21!");
            rounds ++;
            startRound();
         }
         else{
            System.out.println("Dealer has Blackjack. You lose.");
            dealer.printHand();
            losses ++;
            startRound();
         }
      }

      //check blackjack for patron @ start
      //dealer does not also have it
      if(patron.hasBlackjack()){
         System.out.println("You have Blackjack! You win!");
         wins ++;
         startRound();
      }

      //no blackjack @ start, patron will hit or stand
      patron.decide(deck, discarded);

      //check for bust
      if(patron.getHand().calculateHand() > 21){
         System.out.println("You have gone over 21.");
         losses ++;
         startRound();
      }

      //dealer turn
      dealer.printHand();
      while(dealer.getHand().calculateHand() < 17){
         dealer.hit(deck, discarded);
      }

      //check who wins
      if(dealer.getHand().calculateHand()>21){
         System.out.println("Dealer busts");
         wins++;
      }
      else if(dealer.getHand().calculateHand() > patron.getHand().calculateHand()){
         System.out.println("You lose.");
         losses++;
      }
      else if(patron.getHand().calculateHand() > dealer.getHand().calculateHand()){
         System.out.println("You win.");
         wins++;
      }
      else{
         System.out.println("Tie, no winners.");
      }

      //Start a new round
      rounds ++;
      startRound();
   }
}
