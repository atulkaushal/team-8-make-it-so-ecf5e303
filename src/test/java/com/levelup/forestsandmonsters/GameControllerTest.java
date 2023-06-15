package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class GameControllerTest {
     GameController gameController = new GameController();
    
    @Test
    public void initializationCreatesResults() {
       
        assertNotNull(gameController.status);
        assertNotNull(gameController.character);
    }

    @Test
    public void validateDefaultCharacterName() {
        gameController.createCharacter("");
       assertEquals("FlyingDragons",gameController.status.characterName);
       assertEquals("FlyingDragons",gameController.character.getName());
    }

    //Null Scenario
    @Test
    public void validateNullCharacterName() {
        gameController.createCharacter(null);
       assertEquals("FlyingDragons",gameController.status.characterName);
       assertEquals("FlyingDragons",gameController.character.getName());
    }
    //Valid Name
    @Test
    public void validateCharacterName() {
        gameController.createCharacter("Titans");
       assertEquals("Titans",gameController.status.characterName);
       assertEquals("Titans",gameController.character.getName());
    }


   
}
