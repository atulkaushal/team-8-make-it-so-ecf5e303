Feature: Move in a direction 
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player choses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 0 | 0 | NORTH | 10 | 0 | 1 | 11 |
            | 0 | 0 | SOUTH | 32 | 0 | 0 | 33 |
            | 0 | 0 | WEST | 100 | 0 | 0 | 101 |
            | 0 | 0 | EAST | 100 | 1 | 0 | 101 |
            | 9 | 9 | NORTH | 0 | 9 | 9 | 1 |
            | 9 | 9 | EAST | 105 | 9 | 9 | 106 |
            | 9 | 9 | SOUTH | 200 | 9 | 8 | 201 |
            | 9 | 9 | WEST | 200 | 8 | 9 | 201 |
            | 0 | 9 | NORTH | 10 | 0 | 9 | 11 |
            | 0 | 9 | SOUTH | 32 | 0 | 8 | 33 |
            | 0 | 9 | WEST | 100 | 0 | 9 | 101 |
            | 0 | 9 | EAST | 100 | 1 | 9 | 101 |
            | 9 | 0 | NORTH | 10 | 9 | 1 | 11 |
            | 9 | 0 | SOUTH | 32 | 9 | 0 | 33 |
            | 9 | 0 | WEST | 100 | 8 | 0 | 101 |
            | 9 | 0 | EAST | 100 | 9 | 0 | 101 |
            | 5 | 5 | SOUTH | 10 | 5 | 4 | 11 |
            | 5 | 5 | EAST | 16 | 6 | 5 | 17 |
            | 5 | 5 | WEST | 18 | 4 | 5 | 19 |
            | 5 | 5 | NORTH | 5 | 5 | 6 | 6 |
