package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import com.levelup.forestsandmonsters.cli.Direction;
import com.levelup.forestsandmonsters.cli.GameMap;

public class GameMapTest {
    GameMap testObj = new GameMap();
    
    @Test
    public void initializationCreatesResults() {
        assertNotNull(testObj);
    }

    
    @Test
    public void testDirectionMoveSouthSuccess(){
        Direction direction = Direction.SOUTH;
        Position currentPosition = new Position(5, 5);
        Position newPosition = testObj.calculatePosition(currentPosition, direction);
        assertEquals(newPosition.coordinates.xCoordinate, 5);
        assertEquals(newPosition.coordinates.yCoordinate, 4);
    }

    @Test
    public void testDirectionMoveNorthSuccess(){
        Direction direction = Direction.NORTH;
        Position currentPosition = new Position(5, 5);
        Position newPosition = testObj.calculatePosition(currentPosition, direction);
        assertEquals(newPosition.coordinates.xCoordinate, 5);
        assertEquals(newPosition.coordinates.yCoordinate, 6);
    }

    @Test
    public void testDirectionMoveEastSuccess(){
        Direction direction = Direction.EAST;
        Position currentPosition = new Position(5, 5);
        Position newPosition = testObj.calculatePosition(currentPosition, direction);
        assertEquals(newPosition.coordinates.xCoordinate, 6);
        assertEquals(newPosition.coordinates.yCoordinate, 5);
    }

    @Test
    public void testDirectionMoveWestSuccess(){
        Direction direction = Direction.WEST;
        Position currentPosition = new Position(5, 5);
        Position newPosition = testObj.calculatePosition(currentPosition, direction);
        assertEquals(newPosition.coordinates.xCoordinate, 4);
        assertEquals(newPosition.coordinates.yCoordinate, 5);
    }

    @Test
    public void testDirectionMoveSouthEastCorner(){
        Direction direction = Direction.WEST;
        Position currentPosition = new Position(0, 0);
        Position newPosition = testObj.calculatePosition(currentPosition, direction);
        assertEquals(newPosition.coordinates.xCoordinate, 0);
        assertEquals(newPosition.coordinates.yCoordinate, 0);
    }

    @Test
    public void testTotalPositionsAre100()
    {
        assertEquals(100,testObj.getTotalPositions());
    }
}
