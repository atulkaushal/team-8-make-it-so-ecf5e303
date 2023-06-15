package com.levelup.forestsandmonsters.cli;

import com.levelup.forestsandmonsters.Position;

public class GameMap {
    private int numPositions= 100;
    
    public GameMap(){
    }


    public Position calculatePosition(Position currentPosition, Direction direction) {
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
        Position position = new Position(newX, newY);
        if (isPositionValid(position)) {
           return position;
        } else {
            return currentPosition;
        }
    }

    boolean isPositionValid(Position position){
        return (position.getCoordinates().getXCoordinate() >= 0 && 
        position.getCoordinates().getXCoordinate() <= 9 &&
        position.getCoordinates().getYCoordinate() >=0 &&
        position.getCoordinates().getYCoordinate() <= 9);
    }


    public int getTotalPositions() {
        return this.numPositions;
    }

}
