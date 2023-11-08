public class Dealer extends Player{

    //construct Dealer
    public Dealer(){
        //name
        super.setName("Stake.com");
    }

    //print dealer's hand with 1 card face down
    public void printFirst(){
        System.out.println("The dealer's hand: " + super.getHand().getCard(0));
        System.out.println("The second card is face down.");
    }
}