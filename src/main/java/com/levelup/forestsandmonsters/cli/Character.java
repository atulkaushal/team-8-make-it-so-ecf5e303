package com.levelup.forestsandmonsters.cli;

import com.levelup.forestsandmonsters.Position;
import com.levelup.forestsandmonsters.cli.Direction;

public class Character {

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

    public Position move(Position currentPosition, Direction direction) {
        int newX=currentPosition.getCoordinates().getXCoordinate();
        int newY= currentPosition.getCoordinates().getXCoordinate();
        if(currentPosition != null){
            switch(direction){
                case SOUTH:
                    newY=currentPosition.getCoordinates().getXCoordinate()-1;
                    break;
                case NORTH:
                    newY=currentPosition.getCoordinates().getXCoordinate()+1;
                    break;
                case WEST:
                    newX=currentPosition.getCoordinates().getXCoordinate()-1;
                    break;
                case EAST:
                    newX=currentPosition.getCoordinates().getXCoordinate()+1;
                    break;
            }
        }
        return new Position(newX, newY);
    }

    
    
}
