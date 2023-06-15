package com.levelup.forestsandmonsters;

import java.awt.Point;
import com.levelup.forestsandmonsters.cli.Character;
import com.levelup.forestsandmonsters.cli.GameMap;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "FlyingDragons";
    


    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
        // TODO: Write a failing unit test that will force you to set this to the right number
        public int moveCount = -100;
    }

    GameStatus status;
    Character character;
    boolean isGameStarted;
    GameMap gameMap;

    public GameController() {
        status = new GameStatus();
         //Instantiate character
         character = new Character();
         gameMap = new GameMap();
       
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;
            character.setName(name);
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
            character.setName(DEFAULT_CHARACTER_NAME);
        }

       
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
        if(character!=null )
        {
           character.enterMap(gameMap);
           Position position = character.getPosition();
          int xCoordinate = position.getCoordinates().xCoordinate;
          int yCoordinate = position.getCoordinates().yCoordinate;

         
          if(xCoordinate ==0 && yCoordinate ==0)
          {
            isGameStarted=true;
            return;
          }
          

        } 
        isGameStarted=false;
         
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public Character getCharacter() {
        return this.character;
    }
    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
    }

    public void setCharacterPosition(Point coordinates) {
        // TODO: IMPLEMENT THIS TO SET CHARACTERS CURRENT POSITION -- exists to be testable
    }

    public void setCurrentMoveCount(int moveCount) {
        // TODO: IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
    }

    public int getTotalPositions() {
        // TODO: IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        return -10;
    }

  

}
