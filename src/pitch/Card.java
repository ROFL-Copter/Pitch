package pitch;
/**
 * @author  : Dustin Spivey
 * @version : Aug 4, 2014
 */

public class Card {
    Rank rank;
    Suit suit;
    
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
   
    public Card(Rank rank, Suit suit){
       this.rank = rank;
       this.suit = suit;
    }
}//end Card
