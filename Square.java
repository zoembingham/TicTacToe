package TicTacToe;

/**
 * A square is a position on the tic tac toe board.
 * @author Zoe Bingham
 */

public class Square {
    // DEFAULT FILL
    private final SquareFill DEFAULT_FILLING = SquareFill.BLANK;

    // Class level variables
    private SquareFill filling;
    
    //Constructors
    /**
     * Fills a square with BLANK, X, or O
     * @param filling
     */
    public Square(SquareFill filling){
        this.filling = filling;
    }

    /**
     * Creates an instance of a square with the default fill
     * @return
     */
    public Square(){
        this.filling = DEFAULT_FILLING;
    }

    // Getters
    /**
     * Return the current filling of a square
     */
    public SquareFill getFilling(){
        return filling;
    }

    // Setters
    /**
     * Sets the filling to a new filling and returns a message of the change
     * @param filling
     * @return
     */
    public String setFilling(SquareFill filling){
        this.filling = filling;
        return "Square filling has been set to " + filling.toString();
    }


}
