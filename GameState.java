package connect4;

import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author David Rosas
 */
public class GameState {    
    GameBoard newBoard;
    Player activePlayer;
    Player inactivePlayer;
    
    private Icon bluePiece = new ImageIcon("C:\\Users\\mumbo\\Documents\\NetBeansProjects\\Connect4\\src\\connect4\\bluePiece70x70.png");
    private Icon redPiece = new ImageIcon("C:\\Users\\mumbo\\Documents\\NetBeansProjects\\Connect4\\src\\connect4\\redPiece70x70.png");
  
    
    Player player1 = new Player(1, "X",bluePiece);
    Player player2 = new Player(2, "O",redPiece);
    
    public GameState(){
        activePlayer = player1;
        inactivePlayer = player2;
        newBoard = new GameBoard();
    }
    
    public void getInfo(){
        System.out.print("test");
    }
    
    public Player getActivePlayer(){
        return this.activePlayer;
    }
    
    public void setActivePlayer(Player player){
        this.activePlayer = player;
    }
    
    public void endTurn(){
        Player tempPlayer = activePlayer;
        activePlayer = inactivePlayer;
        inactivePlayer = tempPlayer;
    }
    
     public void playerTurn(int col) {        
        
        newBoard.placePiece(col, activePlayer.getPlayerColor());
        //endTurn();            

    }
}
