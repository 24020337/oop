// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
        this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;
        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        for  (int i = 0; i < this.grid.length; i++) {
            for(int j = 0; j < this.grid[i].length; j++) {
                if(this.grid[i][j] == ch) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }
        if (minCol == Integer.MAX_VALUE) {
            return 0;
        }
        return (maxCol-minCol+1)*(maxRow-minRow+1); // YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char c = grid[i][j];

                int up = countArm(i, j, -1, 0, c);
                int down = countArm(i, j, 1, 0, c);
                int left = countArm(i, j, 0, -1, c);
                int right = countArm(i, j, 0, 1, c);

                int min = Math.min(Math.min(up, down), Math.min(left, right));

                if (min >= 1) count++;
            }
        }
        return count;// YOUR CODE HERE
    }

    private int countArm(int i, int j, int di,int dj,char ch) {
        int len = 0;
        i += di; j += dj;
        while (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == ch) {
            len++;
            i += di; j += dj;
        }
        return len;
    }
	
}
