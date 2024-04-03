package lcHot100;

public class lc240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int row = m - 1, col = 0;
        while (row >= 0 && col < n) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) row--;
            else col++;
        }
        return false;
    }

    public static void main(String[] args) {
        lc240 solution = new lc240();
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15},
                                     {2, 5, 8, 12, 19},
                                     {3, 6, 9, 16, 22},
                                     {10, 13, 14, 17, 24},
                                     {18, 21, 23, 26, 30}};
        int target = 16;
        System.out.println(solution.searchMatrix(matrix, target));
    }
}
