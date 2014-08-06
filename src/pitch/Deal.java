package pitch;
/**
 * @author  : Dustin Spivey
 * @version : Aug 4, 2014
 */

public class Deal {
    
    
    Deal(int numPlayers){
        this.numPlayers = numPlayers;
        Deck deck = new Deck();
        deck.buildDeck();
        deck.shuffle();
        deck.printDeck();
        
        for(int i =0; i<numPlayers; i++){
            player[i] = new Player(i);
            for(int j =0; j<6; j++){
                player[i].hand[j] = deck.deck[j];
            }           
        }
    }

}//end Deal
