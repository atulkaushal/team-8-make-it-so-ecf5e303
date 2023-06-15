package com.levelup.forestsandmonsters;

public class Position {
    Point coordinates;

   public Position(int xCoordinate,int yCoordinate)
    {
        this.coordinates=new Point(xCoordinate,yCoordinate);
       
    }

public Point getCoordinates() {
    return coordinates;
}

}
