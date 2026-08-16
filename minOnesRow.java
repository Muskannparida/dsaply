public class minOnesRow {
    
    public static int findRowWithMinOnes(int[][] mat, int n, int m) {
        int minCount = m + 1;   // maximum possible ones + 1
        int minRowIndex = -1;   // store row index

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            // check if this row has fewer 1s
            if (count < minCount) {
                minCount = count;
                minRowIndex = i + 1; // 1-based index
            }
        }
        return minRowIndex;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0, 1},
            {0, 0, 0, 0},
            {1, 1, 0, 0}
        };
        int n = 3, m = 4;
        System.out.println("Row with minimum 1s: " + findRowWithMinOnes(mat, n, m));
    }
}



