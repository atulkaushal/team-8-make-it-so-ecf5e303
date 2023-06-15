package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.cli.Direction;
import com.levelup.forestsandmonsters.cli.GameMap;

public class FakeGameMap extends GameMap{

    @Override
    public Position calculatePosition(Position currentPosition, Direction direction) {
        return new Position(0, 0);
    }


}
