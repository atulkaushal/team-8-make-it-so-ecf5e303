package com.levelup;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.levelup.forestsandmonsters.Position;

public class PositionTest {
    @Test
    public void initializationPosition() {


        int xCoordinate=50;
        int yCoordinate=100;
        Position position=new Position(xCoordinate,yCoordinate);
        assertNotNull(position);
        assertNotNull(position.getCoordinates());
   }

    @Test
    public void validateCoordinates() {


        int xCoordinate=50;
        int yCoordinate=100;
        Position position=new Position(xCoordinate,yCoordinate);
        assertNotNull(position);
        assertNotNull(position.getCoordinates());
        //assert the coordinates
        assertEquals(50, position.getCoordinates().getXCoordinate());
        assertEquals(100, position.getCoordinates().getYCoordinate());

    }

     @Test
    public void validateNegativeCoordinates() {


        int xCoordinate=-10;
        int yCoordinate=-10;
        Position position=new Position(xCoordinate,yCoordinate);
        assertNotNull(position);
        assertNotNull(position.getCoordinates());
        //assert the coordinates
        assertEquals(-10, position.getCoordinates().getXCoordinate());
        assertEquals(-10, position.getCoordinates().getYCoordinate());

    }
    
}
