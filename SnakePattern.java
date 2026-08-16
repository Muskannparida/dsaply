public class SnakePattern {

    public static void printSnakeSquare(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { 
                // Even row → left to right
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else { 
                // Odd row → right to left
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println(); // new line after each row
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int n = 4;
        printSnakeSquare(mat, n);
    }
}

    




