package com.levelup.forestsandmonsters.cli;

import com.levelup.forestsandmonsters.Position;

public class Character {

    public Character(){
        this.name=DEFAULT_CHARACTER_NAME;
    }

    public Character(String name){
        this.name=name;
    }
    private String DEFAULT_CHARACTER_NAME="BOB";

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position move(Position currentPosition, Direction direction) {
        Position newPos = new Position (1,1);
        return newPos;
    }

    
    
}
