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
    private Square[][] board;

    // Constructors
    /**
     * Creates an instance of a size by size tic tac toe board
     * @param size
     */
    public Board(int size){
        this.size = size;
        createBoard();
    }

    /**
     * Creates an instance of a 3 by 3 tic tac toe board
     */
    public Board(){
        this.size = SIZE;
        createBoard();
    }

    // Getters
    /**
     * Returns the board as a 2D square array
     * @return
     */
    public Square[][] getBoard(){
        return board;
    }

    //Setters
    /**
     * Set the filling of the square at col, row to the given filling
     * @param col
     * @param row
     * @return
     */
    public String setSquareFill(int col, int row, SquareFill filling){
        board[col][row].setFilling(filling);
        return "";
    }

    // Functional methods
    /**
     * Initializes the board with blank Squares
     */
    private void createBoard(){
        // Iterate over each row in each column and assign a blank square to each position
        for(int col = 0; col < size; col++){
            for(int row = 0; row < size; row++){
                // Create a new square at col, row
                board[col][row] = new Square(SquareFill.BLANK);
            }
        }
    }
    
}
