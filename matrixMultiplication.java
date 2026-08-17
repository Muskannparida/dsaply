import java.util.Scanner;
public class matrixMultiplication {
    static void  printMatrix(int[][]arr){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0;j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void multiply(int[][]a  , int r1  ,int c1 , int[][]b , int r2 , int c2){
        if(c1 != r2){
            System.out.println("Wrong dimension -- Multiplication not possible !");
            return;
        }
        int[][]ans = new int[r1][c2]; //initial values will be 0
        for(int i = 0 ; i<r1 ; i++){
            for(int j = 0; j<c2 ; j++){

                for(int k = 0;k<c1 ; k++){
                    ans[i][j] +=a[i][k] * b[k][j];
                }
                
            }
        }
        System.out.println("Multiplication of 2 matrices :");
        printMatrix(ans);

    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter the matrix value :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter the number of rows :");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        System.out.println("Enter the matrix value :");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();

            }
        }
        System.out.println("Matrix 1 ");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);

        multiply(a, r1, c1, b, r2, c2);
        sc.close();
        
    }

}
