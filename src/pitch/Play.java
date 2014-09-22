package pitch;
/**
 * @author  : Dustin Spivey
 * @version : Sep 21, 2014
 */

public class Play {
    int numPlayers;
    Player[] player = new Player[8];
    Deck deck = new Deck();
        
    public void play(){
        deck.buildDeck();
        deck.printDeck();
        deck.shuffle();
        deck.printDeck();
        dealDeck(4);
        deck.printDeck();
    }//end play   
    public void dealDeck(int players){
        numPlayers = players;
        player = new Player[players];
        int k = 0;
        for(int i =0; i<numPlayers; i++){
            player[i] = new Player(i+1);
            for(int j =0; j<6; j++){                
                player[i].hand[j] = deck.deck.get(k);
                deck.deck.set(k, null);
                k++;
            }
        }
    }//end Deal Deck
}//end Play
