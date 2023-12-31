package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.levelup.forestsandmonsters.cli.GameStatus;

import org.junit.Test;

public class GameStatusTest {

    FakeGameMap fakeGameMap = new FakeGameMap();
    FakeCharacter fakeCharacter = new FakeCharacter();
    GameStatus gameStatus= new GameStatus(fakeCharacter);
    @Test
    public void initGameStatus()
    {
        assertNotNull(gameStatus);
    }

    @Test
    public void testCharacterNameIsNotNull()
    {
        assertNotNull(gameStatus.getCharacterName());
    }

    @Test
    public void testCharacterNameMatches()
    {
        String name = "Happy";
        FakeCharacter fakeCharacterWithName = new FakeCharacter(name);
        GameStatus gameWithName = new GameStatus(fakeCharacterWithName);
        assertEquals(name, gameWithName.getCharacterName());
    }

    @Test
    public void testCurrentPositionWithoutGameMap()
    {
        assertNull(gameStatus.getCurrentPosition());
    }
    
    @Test
    public void testCurrentPositionSuccess()
    {
        fakeCharacter.enterMap(fakeGameMap);
        assertNotNull(gameStatus.getCurrentPosition());
    }
}
