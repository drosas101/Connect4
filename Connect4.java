package connect4;

/**
 *
 * @author David Rosas
 */
public class Connect4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
    GameBoard newBoard = new  GameBoard();
    newBoard.getBoardState();
    
    int repeat = 7;
    for (int i =0; i < repeat; i++){
        newBoard.placePiece(4,"X");
    }
    
    
    System.out.println();
    newBoard.getBoardState();
    

    }
}
