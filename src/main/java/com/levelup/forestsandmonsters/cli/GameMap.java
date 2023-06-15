package com.levelup.forestsandmonsters.cli;

import com.levelup.forestsandmonsters.Position;

public class GameMap {
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
        return new Position(newX, newY);
    }


}
