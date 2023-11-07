package connect4;

/**
 *
 * @author David Rosas
 */
public class Player {
    private int playerNumber;
    
    public Player(int playerNumber){
        this.playerNumber = playerNumber;
    }
    
    public void setPlayerNumber(int playerNumber){
        this.playerNumber = playerNumber;
    }
    
    public int getPlayerNumber(){
        return this.playerNumber;
    }
}
