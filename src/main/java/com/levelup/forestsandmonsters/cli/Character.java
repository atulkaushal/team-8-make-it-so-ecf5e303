package com.levelup.forestsandmonsters.cli;

import com.levelup.forestsandmonsters.Position;
import com.levelup.forestsandmonsters.cli.Direction;

public class Character {
    private Position currentPosition;
    private GameMap gameMap;
    public Character(){
        this.name=DEFAULT_CHARACTER_NAME;
    }

    public Character(String name){
        this.name=name;
    }
    private String DEFAULT_CHARACTER_NAME="BOB";

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position move(Direction direction) {
        Position currentPosition = getPosition();
        Position newPosition = gameMap.calculatePosition(currentPosition, direction);
        currentPosition = newPosition;
        return newPosition;
    }

    public void enterMap(GameMap gameMap) {
        this.currentPosition = new Position(0, 0);
        this.gameMap = gameMap;
    }

    public Position getPosition() {
        return currentPosition;
    }
}
