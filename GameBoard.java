package connect4;

/**
 *
 * @author David Rosas
 */
public class GameBoard {

    private int rows = 6;
    private int columns = 7;

    Piece[][] mainBoard = new Piece[rows][columns];

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

        if (mainBoard[0][col] == null) {
            for (int i = rows - 1; i >= 0; i--) {
                if (mainBoard[i][col] == null) {
                    mainBoard[i][col] = new Piece();
                    mainBoard[i][col].setColor(color);
                    break;
                }
            }
        } else{
            System.out.print("this column is full");
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

}
