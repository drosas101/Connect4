package connect4;
import java.util.Scanner;
/**
 *
 * @author David Rosas
 */
public class Player {
    private int playerNumber;
    private String playerColor;
    private String playerName;
        
    public Player(int playerNumber,String playerColor){
        this.playerNumber = playerNumber;
        this.playerColor = playerColor;
        this.playerName = "Player" + " " + playerNumber;
    }
    
    public void setPlayerName(int playerNumber){
        this.playerName = "Player" + " " + playerNumber;
    }
    
    public String getPlayerName(){
        return this.playerName;
    }
   
    public void setPlayerNumber(int playerNumber){
        this.playerNumber = playerNumber;
    }
    
    public int getPlayerNumber(){
        return this.playerNumber;
    }
    
    public void setPlayerColor(String color){
        this.playerColor = color;
    }
    
    public String getPlayerColor(){
        return this.playerColor;
    }
    
    public int myTurn(){        
        System.out.printf("%s's turn.\n",this.playerName);
        System.out.print("Enter a column: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
