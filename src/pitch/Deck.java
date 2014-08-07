package pitch;

import java.util.Random;

/**
 * @author  : Dustin Spivey
 * @version : Aug 4, 2014
 */

public class Deck {
    Card[] deck = new Card[52];
    int numPlayers = 0;
    Player[] player = new Player[numPlayers]; 
    
    
//    void buildDeck(){
//        for (int i = 0; i<13; i++){ //Build Spade
//            deck[i] = new Card(i, "Spades");            
//        } //End Spade
//        for (int i = 0; i<13; i++){ //Build Club
//            deck[i+13] = new Card(i+1, "Clubs");
//        } //End Club
//        for (int i = 0; i<13; i++){ //Build Heart
//            deck[i+26] = new Card(i+1, "Hearts");
//        } //End Heart
//        for (int i = 0; i<13; i++){ //Build Diamond
//            deck[i+39] = new Card(i+1, "Diamonds");
//        } //End Diamond
//    }//End BuildDeck
        void builDeck2(){
            for (Suit s : Suit.values()) {
                for (Rank r : Rank.values()) {
                    Card c = new Card(r,s);
                }  
            }
        }
    void shuffle(){
        Card[] tempDeck = new Card[52];
        Random rand = new Random();
        for(int i = 0; i<deck.length; i++){
            int index = rand.nextInt(52);
            if(tempDeck[index] == null)
            tempDeck[index] = deck[i];
            else i--;
        }
        deck = tempDeck;
    }
    void dealDeck(int players){
        numPlayers = players;
        player = new Player[players];
        int k = 0;
        for(int i =0; i<numPlayers; i++){
            player[i] = new Player(i+1);
 
            for(int j =0; j<6; j++){                
                player[i].hand[j] = deck[k];
                deck[k] = null;
                k++;
                }
        }
    }//end Deal Deck
    void printDeck(){
        for (int i = 0; i<deck.length; i++) {
            if(deck[i] !=null){
            System.out.println((i+1) + "\t" + deck[i].rank + "\t" + deck[i].suit);
            }
        }
        System.out.println();
    }// End print Deck
    void printHands(){
        for (int i = 0; i<numPlayers; i++) {
        if(player[i] !=null){
            System.out.println("Player\t" + (i+1));
            for (Card hand : player[i].hand) {
                System.out.println(hand.rank + "\t" + hand.suit);
            }
//            for(int j = 0; j<player[i].hand.length; j++){  // non-enhanced for-loop
//                System.out.println(player[i].hand[j].rank +"\t" +player[i].hand[j].suit);
//            }
        }
    }
    System.out.println();    
    }
        
}//end Deck