public class ConwaysGameOfLife {
    public static void main(String[] args) {
        /*
        Test 1
        int[][] matrix = new int[][]{
                {1, 1},
                {1, 0},
        };
         */

        // Test 2
        int[][] matrix = new int[][]{ 
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {1, 1, 1, 0},
                {0, 0, 0, 0},
        };

        int[][] next = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (checkNeighbours(row, col, matrix)) {
                    next[row][col] = 1;
                } else {
                    next[row][col] = 0;
                }
            }
        }

        printMatrix(next);
    }

    private static boolean checkNeighbours(int row, int col, int[][] matrix) {
        boolean result = false;
        int liveFields = checkForLiveCells(row, col, matrix);

        if (liveFields < 2 && matrix[row][col] == 1) {
            result = false;
        } else if (liveFields > 3 && matrix[row][col] == 1) {
            result = false;
        } else if ((liveFields == 2 || liveFields == 3) && matrix[row][col] == 1) {
            result = true;
        } else if (liveFields == 3 && matrix[row][col] == 0) {
            result = true;
        }

        return result;
    }

    private static int checkForLiveCells(int row, int col, int[][] matrix) {
        int liveFields = 0;

        for (int index1 = row - 1; index1 <= row + 1; index1++) {
            for (int index2 = col - 1; index2 <= col + 1; index2++) {

                if (index1 < 0 ||
                        index2 < 0 ||
                        index1 + 1 > matrix.length ||
                        index2 + 1 > matrix[0].length ||
                        (index1 == row && index2 == col)) {
                    continue;
                } else if (matrix[index1][index2] == 1) {
                    liveFields++;
                }

            }
        }
        return liveFields;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
