package BinarySearch;

public class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int rowStart = matrix[i][0];
            int rowEnd = matrix[i][matrix[i].length - 1];
            if (rowStart <= target && target <= rowEnd) {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    private boolean binarySearch(int[] row, int target) {
        int left = 0, right = row.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (row[mid] == target) return true;
            if (row[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        searchMatrix sol = new searchMatrix();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        int target = 3;

        if (sol.searchMatrix(matrix, target)) {
            System.out.println("Target " + target + " found in matrix.");
        } else {
            System.out.println("Target " + target + " not found in matrix.");
        }
    }
}
