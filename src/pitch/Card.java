package pitch;
/**
 * @author  : Dustin Spivey
 * @version : Aug 4, 2014
 */

public class Card {
    int rank;
    String suit;
    
    public enum Rank {
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE,
    }  
    public enum Suit {
    SPADES, 
    HEARTS, 
    DIAMONDS,
    CLUBS;  
    }
   
    public Card(int rank, String suit){
       this.rank = rank;
       this.suit = suit;
    }
}//end Card
