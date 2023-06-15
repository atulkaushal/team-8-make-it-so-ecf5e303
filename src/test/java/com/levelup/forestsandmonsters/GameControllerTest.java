package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class GameControllerTest {
     GameController gameController = new GameController();
    @Test
    public void initializationCreatesResults() {
       
        assertNotNull(gameController.status);
    }

    @Test
    public void validateDefaultCharacterName() {
        gameController.createCharacter("");
       assertEquals("FlyingDragons",gameController.status.characterName);
    }

    //Null Scenario

    //Valid Name
    
}
