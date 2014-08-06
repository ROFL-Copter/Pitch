package pitch;
/**
 * @author  : Dustin Spivey
 * @version : Aug 4, 2014
 */

public class Player {
    Card[] hand = new Card[6];
    Card[] tricks = new Card[46];
    
    int order;
    
    Player(int order){
        this.order = order;
    }

}//end Player