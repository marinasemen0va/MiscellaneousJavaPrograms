/**
 * this class imitates a search of a maze
 * @author marina semenova
 * @version 1.0 15/04/19
 */

public class Maze {
    /**
     * @param maze maze array
     * @param x row
     * @param y column
     * @return result of the search
     */
    private boolean findEntrance(int[][] maze, int x, int y){
        boolean result = false;
        if (maze[x][y] == 0){ // if entrance found
            maze[x][y] = 5; // set entrance to 5 so when searching for new entrance no confusion
            if (y == 0 && x == 0) // set x y one element right from entrance
                result = mazeSearch(maze, x, y + 1);
            else if ((y == 0 && x == 4) || (y == 4 && x == 0)){
                return true;
            }
            else if (y == 0) // set x y one element right from entrance
                result = mazeSearch(maze, x, y + 1);
            else if (x == 0)  // set x y one element down from entrance
                result = mazeSearch(maze, x + 1, y);
        }
        else { // if not found ( sear
            if (y != 0) // start by searching entire top row
                return findEntrance(maze, x,y - 1); //
            else { // search left column
                if (x != 4)
                    return findEntrance(maze, x + 1, y);
                else
                    return false; // if not found then no more entrance(s)
            }
        }
        if (!result) // if result of mazeSearch is false it's possible to have more entrance(s) so call findEntrance
            return findEntrance(maze, x, y);
        return result; // return final result
    }

    /**
     * this method checks for paths that reach the exit by looking at all elements adjacent to the current
     * parameter pass of x and y. this algorithms runs all paths simultaneously by calling the method if
     * a 0 is found adjacent to x,y, which is 0.
     * @param maze maze array
     * @param x row
     * @param y column
     * @return whether or not a path to exit is possible
     */
    private  boolean mazeSearch(int[][] maze, int x, int y) {
        boolean done = false;
        if (x >= 1 && x <= 3 && y >= 1 && y <= 3) { // search within borders because accessing +=1 or both x and y values
            if ((maze[x][y + 1] == 0 && y == 3) || (maze[x + 1][y] == 0 && x == 3)) { // since only max values allowed for exit check whether on bottom row or top row and contains 0
                return true; }// return true indicating found path
            if (maze[x][y] != 5)  // if accessing start element then don't modify number, otherwise set to 2
                maze[x][y] = 2;
            if (!done) {
                if (maze[x - 1][y] == 0)  // if path not complete then keep searching above
                    done = mazeSearch(maze, x - 1, y);
                if (maze[x][y + 1] == 0)  // if path not complete then keep searching right
                    done = mazeSearch(maze, x, y + 1);
                if (maze[x + 1][y] == 0)  // if path not complete then keep searching below
                    done = mazeSearch(maze, x + 1, y);
                if (maze[x][y - 1] == 0)  // if path not complete then keep searching left
                    done = mazeSearch(maze, x, y - 1);
            }
            if (!done)  // if not found reset element to 0 and return false
                maze[x][y] = 0;
        }
        return done; // return status of path
    }
    /**
     * main method
     * @param args
     */
    public static void main (String[] args){
        Maze m = new Maze();
        int[][] maze = {{1,0,1,1,1},
                        {0,0,0,1,1},
                        {1,1,1,1,1},
                        {0,0,1,1,1},
                        {1,1,1,1,1},};
        System.out.println(m.findEntrance(maze, 0, 4));
    }
}
