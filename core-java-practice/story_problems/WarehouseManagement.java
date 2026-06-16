import java.util.*;

public class WarehouseManagement {
    public static void analyzeStock(int[] stock) {
        int max = stock[0];
        int min = stock[0];
        int sum = 0;

        for (int quantity : stock) {
            if (quantity > max)
                max = quantity;

            if (quantity < min)
                min = quantity;

            sum += quantity;
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + sum);
    }

    public static void findDuplicates(int[] stock) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int quantity : stock) {
            if (!seen.add(quantity)) {
                duplicates.add(quantity);
            }
        }

        System.out.println("Duplicate Quantities: " + duplicates);
    }

    // Rotate array by k positions to the right
    public static void rotateArray(int[] stock, int k) {
        int n = stock.length;
        k = k % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        System.out.println("Rotated Array:");
        System.out.println(Arrays.toString(rotated));
    }

    // Transpose 2D matrix
    public static void transposeGrid(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = grid[i][j];
            }
        }

        System.out.println("Transposed Shelf Grid:");
        for (int[] row : transpose) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        int[] stock = {100, 50, 200, 50, 300, 100};

        analyzeStock(stock);
        findDuplicates(stock);

        int k = 2;
        rotateArray(stock, k);

        int[][] shelfGrid = {
                {1, 2, 3},
                {4, 5, 6}
        };

        transposeGrid(shelfGrid);
    }
}