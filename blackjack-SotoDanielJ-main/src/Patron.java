import java.util.Scanner;

public class Patron extends Player{

    Scanner input = new Scanner(System.in);
    
    //construct Patron
    public Patron(){
        //name
        super.setName("Le Chiffre");
    }

    public void decide(Deck deck, Deck discard){

        int decision = 0;
        boolean answer = true;

        //while answering
        while(answer){
            try {
                System.out.println("Would you like to hit or stand?\n\ntype 1 for Hit or 2 for Stand");
                decision = input.nextInt();
                answer = false;
            } catch (Exception e) {
                System.out.println("Invalid response, try again.");
                input.nextInt();
            }
        }

        //test decide()
        // System.out.println("You selected: " + decision);

        //if hit
        if(decision == 1){
            //hit using deck and discard deck
            this.hit(deck, discard);
            //exit if they have blackjack or bust
            if(this.getHand().calculateHand() > 20){
                return;
            }
            //if no bust or 21
            else{
                this.decide(deck, discard);
            }
        }
        //if they type anything other than "1"
        //assume they stand
        else{
            System.out.println("You stand.");
        }
    }
}
