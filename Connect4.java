package connect4;

/**
 *
 * @author David Rosas
 */
public class Connect4 {

    public static void main(String[] args) {

        //creating a new gameboard    
        GameBoard newBoard = new GameBoard();
        //getting the current state of our board
        newBoard.getBoardState();

        //creating player objects
        Player player1 = new Player(1, "X");
        Player player2 = new Player(2, "O");

        while (!newBoard.isGameOver()) {

            newBoard.playerTurn(player1.getPlayerName(), player1.getPlayerColor());
            newBoard.getBoardState();

            if (newBoard.checkForWin(player1.getPlayerColor()) || newBoard.isBoardFull()) {
                //need to change this to end screen or win screen

                break;
            }

            newBoard.playerTurn(player2.getPlayerName(), player2.getPlayerColor());
            newBoard.getBoardState();

            if (newBoard.checkForWin(player2.getPlayerColor()) || newBoard.isBoardFull()) {
                //need to change this to end screen or win screen

                break;
            }
        }

    }
}
