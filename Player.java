package TicTacToe;

/**
 * A player used to keep track of the turn and winner of a tic tac toe game
 * @author Zoe BinghamS
 */

public class Player {

    // Class level variables
    private char symbol;
    private PlayerState state;

    /**
     * Creates a player with the given character symbol.
     */
    public Player(char symbol){
        this.symbol = symbol;
        this.state = PlayerState.NOT_STARTED;
    }

}
