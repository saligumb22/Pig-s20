package edu.up.cs301.pig;

import edu.up.cs301.game.GameFramework.infoMessage.GameState;

public class PigGameState extends GameState {
    private int player0_id;
    private int player1_id;
    private int player0_score;
    private int player1_score;
    private int runTotal;
    private int dieValue;

    public void gameInitialize() {
        player0_id = 0;
        player1_id = 1;
        player0_score = 0;
        player1_score = 0;
        runTotal = 0;
        dieValue = 0;
    }

    public PigGameState(PigGameState state) {
        player0_id = state.getPlayer0_id();
        player1_id = state.getPlayer1_id();
        player0_score = state.getPlayer0_score();
        player1_score = state.getPlayer1_score();
        runTotal = state.getRunTotal();
        dieValue = state.getDieValue();
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
    public int getRunTotal() {
        return this.runTotal;
    }
    public void setRunTotalrunTotal (int updatedTotal){
        this.runTotal = updatedTotal;
    }
    public int getDieValue() {
        return this.dieValue;
    }
    public void setDieValue (int newDieValue){
        this.runTotal = newDieValue;
    }


}
