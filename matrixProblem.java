import java.util.Scanner;
public class matrixProblem {
    static void printArray(int[][]arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0;j <arr[i].length ; j++){
                 System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][]a  ,int rows , int cols){
        int[][] ans = new int[cols][rows];
        for(int i = 0 ; i<cols; i++){
            for(int j = 0 ; j<rows ; j++){
                ans[i][j] = a[j][i];
            }
        }
        return ans;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of rows :");
            int r = sc.nextInt();
            System.out.println("Enter the no of columns :");
            int c = sc.nextInt();
            int[][]a = new int[r][c];

            int totalElements = r*c;

            System.out.println("Enter "+totalElements+" values .");
            for(int i = 0; i<r;i++){
                for(int j = 0;j<c;j++){
                    a[i][j] = sc.nextInt(); 
                }
            }
            System.out.println("Input matrix : ");
            printArray(a);

            System.out.println("Transpose of the matrix is : ");
            int[][] ans = findTranspose(a, r, c);
            printArray(ans);
            sc.close();
        }

}
