package connect4;

import java.util.Scanner;

/**
 *
 * @author David Rosas
 */
public class GameBoard {
   

    private int rows = 6;
    private int columns = 7;
    private boolean gameOver = false;
    private final Piece[][] mainBoard = new Piece[rows][columns];
    
    //get and set methods
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public boolean getGameOver() {
        return this.gameOver;
    }

    public void setGameOver(boolean state) {
        this.gameOver = state;
    }

    //GameBoard constructor sets all values of the array to null
    public GameBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mainBoard[i][j] = null;
            }
        }
    }

    //check if the spot on the selected column is null
    //creates new piece and sets piece color
    public void placePiece(int column, String color) {
        int col = column - 1;

        //since we already check for a full column in playerTurn()
        //we might be able to remove the if statement
        if (mainBoard[0][col] == null) {
            for (int i = rows - 1; i >= 0; i--) {
                if (mainBoard[i][col] == null) {
                    mainBoard[i][col] = new Piece();
                    mainBoard[i][col].setColor(color);
                    //we can temporarliy comment out break to fill
                        // a column faster for testing
                    break;
                }
            }
        }
        
    }

    //iterates through both dimensions of the array
    //if the value is null then we print _ , otherwise we read the color
    public void getBoardState() {
        
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                if (mainBoard[i][j] == null) {
                    System.out.print("_");
                } else {
                    System.out.print(mainBoard[i][j].getColor());
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    //player enter's column for their piece here. we check if the column is full
    //if the column is full then we ask for a different column. repeat until
    //we find a suitable column to play to. 
    public void playerTurn(String playerName, String playerColor) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s's turn.\n", playerName);
        System.out.print("Enter a column: ");
        int col = input.nextInt();
        boolean tryAgain = isColumnFull(col);

        while (!tryAgain) {
            System.out.printf("Column full. Enter a new column; ");
            col = input.nextInt();
            tryAgain = isColumnFull(col);
        }

        placePiece(col, playerColor);

    }

    //check if a column is full
    public boolean isColumnFull(int inCol) {
        return mainBoard[0][(inCol - 1)] == null;
    }

    public boolean checkForWin(String color) {        
        // Check for vertical win
            for (int col = 0; col < columns; col++) {
                for (int row = 0; row <= rows - 4 ; row++) {
                    if (mainBoard[row][col] != null &&
                        mainBoard[row][col].getColor().equals(color) &&
                        mainBoard[row + 1][col] != null &&
                        mainBoard[row + 1][col].getColor().equals(color) &&
                        mainBoard[row + 2][col] != null &&
                        mainBoard[row + 2][col].getColor().equals(color) &&
                        mainBoard[row + 3][col] != null &&
                        mainBoard[row + 3][col].getColor().equals(color)) {
                    return true; // Vertical win
                    }
                }
            }

            // Check for horizontal win
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col <= columns - 4; col++) {
                    if (mainBoard[row][col] != null &&
                        mainBoard[row][col].getColor().equals(color) &&
                        mainBoard[row][col + 1] != null &&
                        mainBoard[row][col + 1].getColor().equals(color) &&
                        mainBoard[row][col + 2] != null &&
                        mainBoard[row][col + 2].getColor().equals(color) &&
                        mainBoard[row][col + 3] != null &&
                        mainBoard[row][col + 3].getColor().equals(color)) {
                    return true; // Horizontal win
                    }
                }
            }

            // Check for diagonal win (top-left to bottom-right)
            for (int row = 0; row <= rows - 4; row++) {
                for (int col = 0; col <= columns - 4; col++) {
                    if (mainBoard[row][col] != null &&
                        mainBoard[row][col].getColor().equals(color) &&
                        mainBoard[row + 1][col + 1] != null &&
                        mainBoard[row + 1][col + 1].getColor().equals(color) &&
                        mainBoard[row + 2][col + 2] != null &&
                        mainBoard[row + 2][col + 2].getColor().equals(color) &&
                        mainBoard[row + 3][col + 3] != null &&
                        mainBoard[row + 3][col + 3].getColor().equals(color)) {
                    return true; // Diagonal win (top-left to bottom-right)
                    }
                }
            }

            // Check for diagonal win (bottom-left to top-right)
            for (int row = 3; row < rows; row++) {
                for (int col = 0; col <= columns - 4; col++) {
                    if (mainBoard[row][col] != null &&
                        mainBoard[row][col].getColor().equals(color) &&
                        mainBoard[row - 1][col + 1] != null &&
                        mainBoard[row - 1][col + 1].getColor().equals(color) &&
                        mainBoard[row - 2][col + 2] != null &&
                        mainBoard[row - 2][col + 2].getColor().equals(color) &&
                        mainBoard[row - 3][col + 3] != null &&
                        mainBoard[row - 3][col + 3].getColor().equals(color)) {
                    return true; // Diagonal win (bottom-left to top-right)
                    }
                }
            }

            return false; // No win found
        
    }

    public boolean isBoardFull() {
        // need logic to check for win
        for (int i = 0; i < columns; i++)
            if(mainBoard[0][i] == null){
                return false;
            } 
        return true;        
    }

}