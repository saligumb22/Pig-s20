package edu.up.cs301.pig;

import edu.up.cs301.game.GameFramework.GamePlayer;
import edu.up.cs301.game.GameFramework.LocalGame;
import edu.up.cs301.game.GameFramework.actionMessage.GameAction;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import java.util.Random;
import android.util.Log;

import java.util.Random;

/**
 * class PigLocalGame controls the play of the game
 *
 * @author Andrew M. Nuxoll, modified by Steven R. Vegdahl
 * @version February 2016
 */
public class PigLocalGame extends LocalGame {

    /**
     * This ctor creates a new game state
     */
    private PigGameState PigState;

    public PigLocalGame() {
        super();
        PigState = new PigGameState();

        //TODO  You will implement this constructor
    }

    /**
     * can the player with the given id take an action right now?
     */
    @Override
    protected boolean canMove(int playerIdx) {

       return playerIdx == PigState.getPlayerID();
        //TODO  You will implement this method
    }

    /**
     * This method is called when a new action arrives from a player
     *
     * @return true if the action was taken or false if the action was invalid/illegal.
     */
    @Override
    protected boolean makeMove(GameAction action) {
        //TODO  You will implement this method
        if (action instanceof PigHoldAction) {
            if (PigState.getPlayerID() == 1) {
                PigState.setPlayer1(PigState.getPlayer1() + PigState.getRunTotal());
                PigState.setRunTotal(0);
            }
            else {
                PigState.setPlayer0(PigState.getPlayer0() + PigState.getRunTotal());
                PigState.setRunTotal(0);
            }
            //set other turn
            if (PigState.getPlayerID() == 1) {
                PigState.setPlayerID(0);
            }
            else {
                PigState.setPlayerID(1);
            }
            return true;
        } else if (action instanceof PigRollAction) {
            Random rand = new Random();
            int upperbound = 6;
            int lowerbound = 1;
            int random_int = (int) (Math.random() * (upperbound - lowerbound + 1) + lowerbound);
            PigState.setDieValue(random_int);
            if(PigState.getDieValue() !=1){
                PigState.setRunTotal(0);
            if (PigState.getDieValue() == 1) {
                PigState.setRunTotal(0);
            }
            else {
                PigState.setPlayerID(1);
            }
        }
        return true;
    }
    return false;
}

    //makeMove

    /**
     * send the updated state to a given player
     */
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        //TODO  You will implement this method
        p.sendInfo(new PigGameState(PigState));
    }//sendUpdatedSate

    /**
     * Check if the game is over
     *
     * @return
     * 		a message that tells who has won the game, or null if the
     * 		game is not over
     */
    @Override
    protected String checkIfGameOver() {
        //TODO  You will implement this method
        if(PigState.getPlayer0() >= 50) {
            return "Player 1 won the game. Had " + PigState.getPlayer0() + " points.";
        }
        else if (PigState.getPlayer1() >= 50) {
            return "Plater 2 won the game. Had " + PigState.getPlayer1() + " points.";
        }
        return null;
    }

}// class PigLocalGame
