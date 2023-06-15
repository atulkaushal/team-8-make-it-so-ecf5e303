package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import com.levelup.forestsandmonsters.cli.Character;
import com.levelup.forestsandmonsters.cli.Direction;

public class CharacterTest {
    @Test
    public void initializationCreatesResults() {
        Character testObj = new Character();
        assertNotNull(testObj);
    }

    @Test
    public void testCharacterWithDefaultName()
    {
        Character testObj= new Character();
        assertNotNull(testObj.getName());
    }

    @Test
    public void testCharacterDefaultNameShouldBeBOB()
    {
        Character testObj= new Character();
        assertEquals("BOB",testObj.getName());
    }

    @Test
    public void testCharacterShouldTakeUserDefinedName()
    {
        String userDefinedName="Maverick";
        Character testObj= new Character(userDefinedName);
        assertEquals(userDefinedName,testObj.getName());
    }
    
    @Test
    public void testDirection(){
        Character testObj= new Character();
        Direction direction = Direction.SOUTH;
        Position currentPosition = new Position(5, 5);
        Position newPosition = testObj.move(currentPosition, direction);
        assertNotNull(newPosition);
    }

    @Test
    public void testDirectionMoveSuccess(){
        Character testObj= new Character();
        Direction direction = Direction.SOUTH;
        Position currentPosition = new Position(5, 5);
        Position newPosition = testObj.move(currentPosition, direction);
        assertEquals(newPosition.coordinates.xCoordinate, 5);
        assertEquals(newPosition.coordinates.yCoordinate, 4);
    }

    @Test
    public void testDirectionMoveSouthSuccess(){
        Character testObj= new Character();
        Direction direction = Direction.SOUTH;
        Position currentPosition = new Position(5, 5);
        Position newPosition = testObj.move(currentPosition, direction);
        assertEquals(newPosition.coordinates.xCoordinate, 5);
        assertEquals(newPosition.coordinates.yCoordinate, 4);
    }

    @Test
    public void testDirectionMoveNorthSuccess(){
        Character testObj= new Character();
        Direction direction = Direction.NORTH;
        Position currentPosition = new Position(5, 5);
        Position newPosition = testObj.move(currentPosition, direction);
        assertEquals(newPosition.coordinates.xCoordinate, 5);
        assertEquals(newPosition.coordinates.yCoordinate, 6);
    }

    @Test
    public void testDirectionMoveEastSuccess(){
        Character testObj= new Character();
        Direction direction = Direction.EAST;
        Position currentPosition = new Position(5, 5);
        Position newPosition = testObj.move(currentPosition, direction);
        assertEquals(newPosition.coordinates.xCoordinate, 6);
        assertEquals(newPosition.coordinates.yCoordinate, 5);
    }

    @Test
    public void testDirectionMoveWestSuccess(){
        Character testObj= new Character();
        Direction direction = Direction.WEST;
        Position currentPosition = new Position(5, 5);
        Position newPosition = testObj.move(currentPosition, direction);
        assertEquals(newPosition.coordinates.xCoordinate, 4);
        assertEquals(newPosition.coordinates.yCoordinate, 5);
    }
}