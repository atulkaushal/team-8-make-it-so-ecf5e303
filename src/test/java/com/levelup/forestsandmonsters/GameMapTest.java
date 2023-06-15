package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

import com.levelup.forestsandmonsters.cli.GameMap;

public class GameMapTest {
    @Test
    public void initializationCreatesResults() {
        GameMap testObj = new GameMap();
        assertNotNull(testObj);
    }
}
