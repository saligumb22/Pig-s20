package edu.up.cs301.pig;

import edu.up.cs301.game.GameFramework.infoMessage.GameState;

public class PigGameState extends GameState {
    private int playerID;
    private int player0;
    private int player1;
    private int runTotal;
    private int dieValue;

    public PigGameState() {
        playerID = 0;
        player0 = 0;
        player1 = 0;
        runTotal = 0;
        dieValue = 1;
    }

    public PigGameState(PigGameState state) {
        this.playerID = state.playerID;
        this.player0 = state.player0;
        this.player1 = state.player1;
        this.runTotal = state.runTotal;
        this.dieValue = state.dieValue;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int pID) {
        this.playerID = pID;
    }

    public int getPlayer0() {
        return player0;
    }

    public void setPlayer0(int p0) {
        this.player0 = p0;
    }

    public int getPlayer1() {
        return player1;
    }

    public void setPlayer1(int p1) {
        this.player1 = p1;
    }

    public int getRunTotal() {
        return runTotal;
    }

    public void setRunTotal (int rT){
        this.runTotal = rT;
    }

    public int getDieValue() {
        return dieValue;
    }

    public void setDieValue (int vD){
        this.runTotal = vD;
    }


}
