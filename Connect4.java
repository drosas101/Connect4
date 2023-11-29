package connect4;

/**
 *
 * @author David Rosas
 */
public class Connect4 {

    public static void main(String[] args) {
        
        //display the start screen
        new GameGUI().setVisible(true);
        
        //creating a new gameboard    
        GameBoard newBoard = new GameBoard();
        //getting the current state of our board
        newBoard.getBoardState();

        //creating player objects
        Player player1 = new Player(1, "X");
        Player player2 = new Player(2, "O");
        
       

        while (!newBoard.getGameOver()) {

            newBoard.playerTurn(player1.getPlayerName(), player1.getPlayerColor());
            newBoard.getBoardState();
            System.out.print(newBoard.isBoardFull());
            
            if (newBoard.checkForWin(player1.getPlayerColor()) || newBoard.isBoardFull()) {
                //need to change this to end screen or win screen

                newBoard.setGameOver(true);
                System.out.print("Player 1 Wins!");
                break;
            }

            newBoard.playerTurn(player2.getPlayerName(), player2.getPlayerColor());
            newBoard.getBoardState();
            //System.out.print(newBoard.isBoardFull());

            if (newBoard.checkForWin(player2.getPlayerColor()) || newBoard.isBoardFull()) {
                //need to change this to end screen or win screen

                newBoard.setGameOver(true);
                System.out.print("Player 2 Wins!");
                break;
            }            
            
        }

    }
}