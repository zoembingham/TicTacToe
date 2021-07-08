package TicTacToe;

/**
 * A board of a specifized size to be used in a tic tac toe game
 * @author Zoe Bingham
 */

public class Board {
    // DEFAULT SIZE
    private final int SIZE = 3;

    // Class level variables
    private int size;

    /**
     * Creates a size by size tic tac toe board
     * @param size
     */
    public Board(int size){
        this.size = size;
    }

    /**
     * Creates a 3 by 3 tic tac toe board
     */
    public Board(){
        this.size = SIZE;
    }
    
}
