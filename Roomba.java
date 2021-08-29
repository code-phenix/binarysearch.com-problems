// A Roomba robot is currently sitting in a Cartesian plane at (0, 0). You are given a list of its moves that it will make, containing NORTH, SOUTH, WEST, and EAST.

// Return whether after its moves it will end up in the coordinate (x, y).

// Constraints

// n ≤ 100,000 where n is length of moves
// Example 1
// Input
// moves = ["NORTH", "EAST"]
// x = 1
// y = 1
// Output
// true
// Explanation
// Moving north moves it to (0, 1) and moving east moves it to (1, 1)

// Example 2
// Input
// moves = ["WEST", "EAST"]
// x = 1
// y = 0
// Output
// false
// Explanation
// This Roomba will end up at (0, 0)

class Solution {
    public boolean solve(String[] moves, int x, int y) {
        int tempX=0,tempY=0;
        for(int i=0;i<moves.length;i++){
                if(moves[i].equals("NORTH"))
                    tempY++;
                else if(moves[i].equals("SOUTH"))
                    tempY--;
                else if(moves[i].equals("WEST"))
                    tempX--;
                else 
                    tempX++;
        }
        if(tempX==x&&tempY==y)
            return true;
        return false;
    }
}

//Your code took 54 milliseconds — faster than 99.46% in Java
