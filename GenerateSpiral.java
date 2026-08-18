import java.util.Scanner;
public class GenerateSpiral {
    static void printMatrix(int[][]arr){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n){
        int[][]ans = new int[n][n];
        int topRow = 0;
        int bottomRow = n-1;
        int leftCol = 0;
        int rightCol = n-1;

        int current = 1;
         while(current <= n*n){
            //printing top row--->leftcolumn to rightcolumn.
            for(int j = leftCol ; j<=rightCol && current <= n*n ; j++){
                ans[topRow][j] = current;
                current++;
                

            }
            //printing right column---->toprow to bottomrow
            for(int  i = topRow+1; i <= bottomRow && current <= n*n ; i++){
                ans[i][rightCol] = current;
                current++;

            }
            //printing bottom row--->rightcol to left col
            for(int j  = rightCol-1 ; j>=leftCol&& current <= n*n;j--){
                ans[bottomRow][j]  = current;
                current++;

            }
            //printing left column-->  bottom row to toprow
            for(int i = bottomRow-1 ; i>=topRow+1&& current <= n*n  ; i--){
                ans[i][leftCol] = current;
                current++;

            }
            topRow++;
        bottomRow--;
        leftCol++;
        rightCol--;

        }
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        int[][]ans = generateSpiralMatrix(n);
        printMatrix(ans);
        sc.close();

    }

}
