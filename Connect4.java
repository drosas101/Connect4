package connect4;
import java.util.Scanner;
/**
 *
 * @author David Rosas
 */
public class Connect4 {

    public static void main(String[] args) {

    //creating a new gameboard    
    GameBoard newBoard = new  GameBoard();
    //getting the current state of our board
    newBoard.getBoardState();
    
    //creating player objects
    Player player1 = new Player(1,"X");
    Player player2 = new Player(2,"O");
    
    //using placePiece we can call player.myTurn() which returns
        //the player's selection and we call player.getPlayerColor()
        //to input the players color into the board
    newBoard.placePiece(player1.myTurn(), player1.getPlayerColor());
    
    System.out.println();
    
    //get the updated board state after placing a piece
    newBoard.getBoardState();
    
    //using placePiece we can call player.myTurn() which returns
        //the player's selection and we call player.getPlayerColor()
        //to input the players color into the board
    newBoard.placePiece(player2.myTurn(),player2.getPlayerColor());
    
    System.out.println();
    
    //get the update board state after placing a piece
    newBoard.getBoardState();
    

    }
}
