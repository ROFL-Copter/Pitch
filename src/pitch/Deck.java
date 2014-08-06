package pitch;

import java.util.Random;

/**
 * @author  : Dustin Spivey
 * @version : Aug 4, 2014
 */

public class Deck {
    Card[] deck = new Card[52];
    int players = 4;
    
    void buildDeck(){
        for (int i = 0; i<13; i++){ //Build Spade
            deck[i] = new Card(i+1, "Spades");            
        } //End Spade
        for (int i = 0; i<13; i++){ //Build Club
            deck[i+13] = new Card(i+1, "Clubs");
        } //End Club
        for (int i = 0; i<13; i++){ //Build Heart
            deck[i+26] = new Card(i+1, "Hearts");
        } //End Heart
        for (int i = 0; i<13; i++){ //Build Diamond
            deck[i+39] = new Card(i+1, "Diamonds");
        } //End Diamond
    }//End BuildDeck
    
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
    void printDeck(){
        for (int i = 0; i<deck.length; i++) {
            if(deck[i] !=null){
            System.out.println((i+1) + "\t" + deck[i].value + "\t" + deck[i].suit);
            }
        }
        System.out.println();
    }
    void dealDeck(int players){
        int numPlayers = players;
        Player[] player = new Player[players];
        int k = 0;
        for(int i =0; i<numPlayers; i++){
            player[i] = new Player(i);
 
            for(int j =0; j<6; j++){                
                player[i].hand[j] = deck[k];
                deck[k] = null;
                k++;
                }
        }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    }//end Deal Deck
    void printDeck(){
        for (int i = 0; i<deck.length; i++) {
            if(deck[i] !=null){
            System.out.println((i+1) + "\t" + deck[i].value + "\t" + deck[i].suit);
            }
        }
        System.out.println();
    }// End print Deck
    void printHand(int order){
        for (int i = 0; i<players; i++) {
        if(player[i] !=null){
        System.out.println((i+1) + "\t" + player[i].order + "\t" + player[i].hand[i].suit);
        }
=======
        
        
        
        
>>>>>>> origin/master
    }
    System.out.println();    
    }
=======
>>>>>>> parent of a41b110... 0.1.4D
=======
>>>>>>> parent of a41b110... 0.1.4D
=======
>>>>>>> parent of a41b110... 0.1.4D
        
        
        
        
<<<<<<< HEAD
<<<<<<< HEAD
=======
        
        
        
        
>>>>>>> parent of a41b110... 0.1.4D
=======
>>>>>>> parent of a41b110... 0.1.4D
=======
>>>>>>> parent of a41b110... 0.1.4D
    }
    
    
    
    
}//end Deck
