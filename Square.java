package TicTacToe;

/**
 * A square is a position on the tic tac toe board.
 * @author Zoe Bingham
 */

public class Square {

    // Class level variables
    private SquareFill filling;
    
    /**
     * Fills a square with BLANK, X, or O
     * @param filling
     */
    public Square(SquareFill filling){
        this.filling = filling;
    }

}
