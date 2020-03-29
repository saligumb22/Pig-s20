package edu.up.cs301.pig;

import org.junit.Test;

import static org.junit.Assert.*;

public class PigGameStateTest {

    @Test
    public void getPlayerID() {
        PigGameState testID = new PigGameState();
        assertEquals(0,testID.getPlayerID());
    }

    @Test
    public void setPlayerID() {
        PigGameState testID = new PigGameState();
        testID.setPlayerID(10);
        assertTrue(testID.playerID == 10);
    }

    @Test
    public void getPlayer0() {
        PigGameState player0 = new PigGameState();
        assertEquals(0,player0.getPlayer0());
    }

    @Test
    public void setPlayer0() {
        PigGameState testplayer0 = new PigGameState();
        testplayer0.setPlayer0(12);
        assertTrue(testplayer0.player0 == 12);
    }

    @Test
    public void getPlayer1() {
        PigGameState testplayer1 = new PigGameState();
        assertEquals(0,testplayer1.getPlayer1());
    }

    @Test
    public void setPlayer1() {
        PigGameState testplayer1 = new PigGameState();
        testplayer1.setPlayer1(2);
        assertTrue(testplayer1.player1 == 2);
    }

    @Test
    public void getRunTotal() {
    }

    @Test
    public void setRunTotal() {
    }

    @Test
    public void getDieValue() {
    }

    @Test
    public void setDieValue() {
    }
}