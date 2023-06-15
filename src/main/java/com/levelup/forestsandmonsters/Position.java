package com.levelup.forestsandmonsters;

public class Position {
    Point coordinates;

   public Position(int xCoordinate,int yCoordinate)
    {
        this.coordinates=new Point();
        coordinates.setXCoordinate(50);
        coordinates.setYCoordinate(100);
    }

public Object getCoordinates() {
    return coordinates;
}

}
