package edu.up.cs301.pig;

import edu.up.cs301.game.GameFramework.infoMessage.GameState;

public class PigGameState extends GameState {
    private int player0_id = 0;
    private int player1_id = 1;
    private int player0_score = 0;
    private int player1_score = 0;
    private int runTotal = 0;
    private int dieValue = 0;

    public static void main() {
        public gameInitialize ;
    }

    public int getPlayer0_id() {
        return this.player0_id;
    }

    public void setPlayer0_id(int player0id) {
        this.player0_id = player0id;
    }

    public int getPlayer1_id() {
        return this.player1_id;
    }

    public void setPlayer1_id(int player1id) {
        this.player1_id = player1id;
    }

    public int getPlayer0_score() {
        return this.player0_score;
    }

    public void setPlayer0_score(int player0score) {
        this.player0_score = player0score;
    }

    public int getPlayer1_score() {
        return this.player1_score;
    }
    public void setPlayer1_score (int player1score){
        this.player1_score = player1score;
    }

}
