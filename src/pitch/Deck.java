package pitch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author  : Dustin Spivey
 * @version : Aug 4, 2014
 */

public class Deck {
    List<Card> deck = new ArrayList<>();
    void buildDeck(){
        for (int i = 0; i<13; i++){ //Build Spade
            deck.add(new Card(i+1, "Spades"));
        } //End Spade
        for (int i = 0; i<13; i++){ //Build Club
            deck.add(new Card(i+1, "Clubs")); 
        } //End Club
        for (int i = 0; i<13; i++){ //Build Heart
            deck.add(new Card(i+1, "Hearts")); 
        } //End Heart
        for (int i = 0; i<13; i++){ //Build Diamond
            deck.add(new Card(i+1, "Diamonds")); 
        } //End Diamond
    }//End BuildDeck
    void shuffle(){
        Collections.shuffle(deck);
    } 
    void printDeck(){
        for (int i = 0; i<deck.size(); i++) {
            if(deck.get(i) !=null){
            System.out.println((i+1) + "\t" + deck.get(i).rank + "\t" + deck.get(i).suit);
            }
        }
        System.out.println();
    }// End print Deck      
}//end Deck