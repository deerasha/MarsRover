package MarsRover;

/**
 *
 * @author Deerasha
 */
public class Zone {

    private int n;
    private int m;
    char[][] field;
    int currX;
    int currY;

    Zone(int n, int m) {
        this.n = n;
        this.m = m;
        field = new char[n][m];
        currX = 0;
        currY = 0;
    }

    /**
     * Sets all blocks in the field to 0, denoting an unvisited block.
     */
    void clear() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                field[i][j] = '0';
            }
        }
    }

    /**
     * Sets the block to visited as a '.', if the block exists in the Zone. If
     * the given co-ordinate is not visitable because it exists outside the
     * Zone, the visit is not made. Direction is represented using Cartesian
     * identities for x and y axes.
     *
     * @param movX - the x transform
     * @param movy - the y transform
     */
    void visit(int movX, int movY) {
        int toX = currX + movX;
        int toY = currY + movY;
        if (toX >= 0 && toY >= 0 && toX < n && toY < m) {
            currX = toX;
            currY = toY;
            field[currX][currY] = '.';
        }
    }

    /**
     * Pretty print for the Zone
     */
    void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

}//end class
