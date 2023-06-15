package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import com.levelup.forestsandmonsters.cli.Character;
import com.levelup.forestsandmonsters.cli.Direction;

public class CharacterTest {
    FakeGameMap fakeGameMap = new FakeGameMap();
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
    public void testEnterMap(){
        Character testObj= new Character();
        testObj.enterMap(fakeGameMap);
    }
    
   /* @Test
    public void testDirection(){
        Character testObj= new Character();
        Direction direction = Direction.SOUTH;
        Position newPosition = testObj.move(direction);
        assertNotNull(newPosition);
    }

    @Test
    public void testDirectionMoveSuccess(){

        Character testObj= new Character();
        Direction direction = Direction.SOUTH;
        Position newPosition = testObj.move(direction);
        assertEquals(newPosition.coordinates.xCoordinate, 5);
        assertEquals(newPosition.coordinates.yCoordinate, 4);
    }*/ 
}