/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitch;
/**
 * @author  : Dustin Spivey
 * @version : Aug 4, 2014
 */

public class Pitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Play play = new Play();
        play.play();
        
        for(int i = 0; i<play.numPlayers; i++){
            play.player[i].printHand();
        }
    }
}