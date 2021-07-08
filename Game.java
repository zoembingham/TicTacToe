package TicTacToe;
/**
 * Logic for the game of Tic Tac Toe:
 * 
 * Game Desc: Tic tac toe is a two player game in which each player is assigned
 * either an 'X' or an 'O'. The player assigned 'O' is the first to play. During
 * each player's turn, they mark a square on the board and then the next player's
 * turn starts. To win the match, a player must occupy an entire row, column, or
 * diagonal of the board. If all the squares are occupied and neither player has
 * won, then the game results in a draw.
 * 
 * @author Zoe Bingham
 */

 public class Game{

    // Class level variables
    private Board board;
    private Player playerOne;
    private Player playerTwo;
    private GameState gameState;

    /**
     * Constuctor for a tic tac toe game, given a board and two players
     * @param board
     */
    public Game(Board board, Player playerOne, Player playerTwo){
        this.board = board;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.gameState = GameState.NOT_STARTED;
    }
 }