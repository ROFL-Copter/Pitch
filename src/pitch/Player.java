package pitch;
/**
 * @author  : Dustin Spivey
 * @version : Aug 4, 2014
 */

public class Player {
    Card[] hand = new Card[6];
    Card[] tricks = new Card[48];
    int score;
    int order;
    
    Player(int order){
        this.order = order;
    }
    void printHand(){
        for (Card hand1 : hand) {
            System.out.println(hand1.rank + "\t" + hand1.suit);
        }      
        System.out.println();    
    }//end printHand
}//end Player