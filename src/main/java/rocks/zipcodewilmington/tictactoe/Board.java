package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        // check rows
        for (int i = 0; i < 3; i++) {
            int rowCounter = 0;
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 'X') {
                    rowCounter++;
                }
            }
            if (rowCounter == 3) return true;
        }

        // checking columns
        for (int i = 0; i < 3; i++) {
            int columnCounter = 0;
            for (int j = 0; j < 3; j++) {
                if (matrix[j][i] == 'X') {
                    columnCounter++;
                }
            }
            if (columnCounter == 3) return true;
        }

        if (matrix[0][0] == matrix[1][1] && matrix[2][2] == 'X') return true;// forward slash)

        if (matrix[0][2] == matrix[1][1] && matrix[2][0] == 'X') return true; // back slash

        return false;
    }

    public Boolean isInFavorOfO() {
        // check rows
        for (int i = 0; i < 3; i++) {
            int rowCounter = 0;
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 'O') {
                    rowCounter++;
                }
            }
            if (rowCounter == 3) return true;
        }

        // checking columns
        for (int i = 0; i < 3; i++) {
            int columnCounter = 0;
            for (int j = 0; j < 3; j++) {
                if (matrix[j][i] == 'O') {
                    columnCounter++;
                }
            }
            if (columnCounter == 3) return true;
        }

        if (matrix[0][0] == matrix[1][1] && matrix[2][2] == 'O') return true;// forward slash)

        if (matrix[0][2] == matrix[1][1] && matrix[2][0] == 'O') return true; // back slash

        return false;
    }

    public Boolean isTie() {
        boolean isTie = false;

        if (!isInFavorOfO() && !isInFavorOfX()) {
            isTie = true;

        }
        return isTie;
    }

    public String getWinner() {
        String Xwinner = "X";
        String Owinner = "O";
        if (isInFavorOfO()) {
            return Owinner;
        }

        if (isInFavorOfX()) {
            return Xwinner;
        }

        return "" ;
    }

}
