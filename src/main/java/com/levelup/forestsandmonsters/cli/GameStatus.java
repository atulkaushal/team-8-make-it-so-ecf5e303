package com.levelup.forestsandmonsters.cli;

public class GameStatus {

    private Character character;

    public GameStatus(Character character){
        this.character = character;
    }

    public String getCharacterName()
    {
        return character.getName();
    }

    public Object getCurrentPosition() {
        return character.getPosition();
    }

}
