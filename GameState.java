package connect4;


/**
 *
 * @author David Rosas
 */
public class GameState {    
    GameBoard newBoard;
    Player activePlayer;
    Player inactivePlayer;
    
    Player player1 = new Player(1, "X");
    Player player2 = new Player(2, "O");
    
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
        endTurn();            

    }
}
