package pl.piotr.holda.codingtask;

public class Lines {

    public static void main(String[] args) {
        /* Find length of the longest horizontal, vertical or diagonal line of 1  in the given matrix: */
        int[][] matrix = new int[][]{
                {0, 0, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 0, 0, 0, 1}
        };
        System.out.println(findTheLongestLine(matrix));
    }

    private static int findTheLongestLine(int[][] matrix) {
        int max = 0;
        int[] counters = new int[matrix[0].length];
        int[] left = new int[matrix[0].length];
        int[] right = new int[matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 1) {
                    count = count + 1;
                    if (max < count) {
                        max = count;
                    }
                } else {
                    count = 0;
                }
            }

            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 1) {
                    counters[col] = counters[col] + 1;
                    if (max < counters[col]) {
                        max = counters[col];
                    }
                } else {
                    counters[col] = 0;
                }
            }

            for (int col = matrix[0].length - 1; col >= 0; col--) {
                if (matrix[row][col] == 1) {

                    int index = col - 1;
                    if (index >= 0) {
                        right[col] = right[index] + 1;
                        if (max < right[col]) {
                            max = right[col];
                        }
                    }
                } else {
                    right[col] = 0;

                }
            }
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 1) {
                    int index = col + 1;
                    if (index < matrix[0].length) {
                        left[col] = left[index] + 1;
                        if (max < left[col]) {
                            max = left[col];
                        }
                    }

                } else {
                    left[col] = 0;
                }
            }

        }
        return max;
    }
}
