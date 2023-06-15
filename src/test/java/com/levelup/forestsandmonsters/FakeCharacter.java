package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.Position;
import com.levelup.forestsandmonsters.cli.Character;
import com.levelup.forestsandmonsters.cli.Direction;

public class FakeCharacter extends Character{
    
    public FakeCharacter(){
        super();
    }

    public FakeCharacter(String characterName){
        super(characterName);
    }

    @Override
    public Position move(Direction direction) {
        return new Position (0,0);
    }
}
