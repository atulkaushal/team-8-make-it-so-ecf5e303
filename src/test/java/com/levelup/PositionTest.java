package com.levelup;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import com.levelup.forestsandmonsters.Position;

public class PositionTest {
    @Test
    public void initializationPosition() {


        int xCoordinate=0;
        int yCoordinate=0;
        Position position=new Position(xCoordinate,yCoordinate);
        assertNotNull(position);
        assertNotNull(position.getCoordinates());
        //assert the coordinates
        assertNotNull(position.getCoordinates());



    }
    
}
