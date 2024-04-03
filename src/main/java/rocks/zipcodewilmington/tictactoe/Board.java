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
        int xCounter = 0;
        int oCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[j].equals('X')) {
                    xCounter++;
                } else {
                    oCounter++;
                }

                }
            }
        if (xCounter > oCounter) {
            return true;
        } else {
            return false;
        }
    }
    public Boolean isInFavorOfO() {
        int xCounter = 0;
        int oCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[j].equals('O')) {
                    xCounter++;
                } else {
                    oCounter++;
                }

            }
        }
        if (oCounter > xCounter) {
            return true;
        } else {
            return false;
        }
    }


    public Boolean isTie() {
        int xCounter = 0;
        int oCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[j].equals('X')) {
                    xCounter++;
                } else {
                    oCounter++;
                }

            }
        }
        if (xCounter == oCounter) {
            return true;
        } else {
            return false;
        }
    };


    public String getWinner() {
        return null;
    }

}
