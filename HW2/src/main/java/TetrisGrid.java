//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
	}

	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
        int row = grid.length;
        int col = grid[0].length;
        int w = row - 1;
        for(int r = row - 1; r >= 0; r--) {
            if(!isTrueRow(grid[r])) {
                grid[w] = grid[r];
                if (w != r) {
                    grid[r] = new boolean[col];
                }
                w--;
            }
        }
        for(int r = w; r >=0; r--) {
            grid[r] = new boolean[col];
        }
	}

    private boolean isTrueRow(boolean[] row) {
        for(int i=0 ; i<row.length; i++) {
            if (row[i] == false) {
                return false;
            }
        }
        return true;
    }

	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid; // YOUR CODE HERE
	}
}
