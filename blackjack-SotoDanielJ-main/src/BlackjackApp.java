public class BlackjackApp {
public static void main(String[] args) throws Exception {
        
        System.out.println("Welcome to the Casino");
        
        Game game = new Game();
                game.Play();

}
}
//      test Suit enum
//      System.out.println(Suit.CLUB);

//      test CardValue enum
//      System.out.println(CardValue.SIX + " has a value of " + CardValue.SIX.cardValueValue);

//      test Card
//      Card cardTest = new Card(Suit.CLUB, CardValue.SIX);
//              System.out.println(cardTest);

//      test Deck
//make cards and deck
//      Deck testDeck = new Deck();
//         Card card1 = new Card(Suit.CLUB, CardValue.JACK);
//         Card card2 = new Card(Suit.DIAMOND, CardValue.FIVE);
//         Card card3 = new Card(Suit.HEART, CardValue.ACE);
//      //add cards
//      testDeck.addCard(card1);
//      testDeck.addCard(card2);
//      testDeck.addCard(card3);
//         System.out.println(testDeck);

//test 52 card deck
//         Deck testDeck = new Deck(true);
//                 System.out.println(testDeck);   

//      test shuffled 52 card deck
// Deck testDeck = new Deck(true);
// testDeck.shuffle();
//         System.out.println(testDeck);

// //      test Hand and Drawing Cards
//         Deck testDeck = new Deck(true);
//         Hand testHand = new Hand();
//                 testHand.draw(testDeck);
//                 testHand.draw(testDeck);
//                 testHand.draw(testDeck);
//         System.out.println("Your hand: " + testHand);
//         System.out.println("Remaining deck: " + testDeck);

//      test hand calculation
// Deck testDeck = new Deck();
//         testDeck.addCard(new Card(Suit.DIAMOND, CardValue.ACE));
//         testDeck.addCard(new Card(Suit.HEART, CardValue.ACE));
//         testDeck.addCard(new Card(Suit.CLUB, CardValue.ACE));
//         testDeck.addCard(new Card(Suit.SPADE, CardValue.ACE));
// Hand testHand = new Hand();
//         testHand.draw(testDeck);
//         testHand.draw(testDeck);
//         testHand.draw(testDeck);
//         testHand.draw(testDeck);
// System.out.println("The value of your hand is: " + testHand.calculateHand());

// //      test Dealer construct
//         Dealer myDealer = new Dealer();
//         System.out.println("The dealer's name is: " + myDealer.getName());
