package pitch;

import java.util.Scanner;

/**
 * @author  : Dustin Spivey
 * @version : Sep 21, 2014
 */

public class Play {
    int numPlayers;
    Player[] player = new Player[8];
    Deck deck = new Deck();
        
    public void play(){
        deck.buildDeck();                   //builds the initial deck of cards
        deck.shuffle();                       //shuffles deck
        dealDeck(4);                        //deals the deck to the amount of players in the parameter
        printHand();                        //Prints the hand of each player to test
        bid();
        

    }//end play   
    private void dealDeck(int players){  //This method deals the deck the the amount of players in the parameter
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
    private void bid(){
        for(int i = 0; i < numPlayers; i++){
            Scanner input = new Scanner(System.in);
            if(i<(numPlayers-1)){
                System.out.println("Player " + player[i+1].order + " please enter a bid between 2 and 4 or type 0 to pass");
                player[i+1].bid = input.nextInt();
                if((player[i+1].bid != 0) &&(player[i+1].bid != 2)&&(player[i+1].bid != 3) &&(player[i+1].bid != 4)){
                    System.out.println("Bid not acceptable.");
                    i--;
                }
            }else if(i==(numPlayers-1)){
                System.out.println("Dealer please enter a bid between 2 and 4 or type 0 to pass");
                player[0].bid = input.nextInt();
                if((player[0].bid != 0) &&(player[0].bid != 2)&&(player[0].bid != 3) &&(player[0].bid != 4)){
                    System.out.println("Bid not acceptable.");
                    i--;
                }
            }
        }       
    }//end bid
    public void printHand(){
        for(int i = 0; i<numPlayers; i++){
            player[i].printHand();
        }
    }
}//end Play
