import java.util.Scanner;

public class PreCalcRectangle {

    static void findPrefixSumMatrix(int[][]arr){
        int  r = arr.length;
        int  c = arr[0].length;  //no of columns is same as no of cols present in 0th row.

        //traverse horizontally to calculate rowwise prefixSum.
        for(int i = 0 ; i<r;i++){
            for(int j = 1;j<c;j++){
                arr[i][j] += arr[i][j-1];
            }
        }
    }
    static int FindSum2(int[][]arr , int l1 , int r1 , int l2 , int r2){
        int sum = 0;
        findPrefixSumMatrix(arr);

        for(int i = l1 ; i<=l2 ; i++){
            //r1 to r2 sum for row i .
            if(r1>=1)
            sum+=arr[i][r2] - arr[i][r1-1];
        else 
            sum +=arr[i][r2];
        }
        return sum;

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
            System.out.println("Enter the boundaries : ");
            int l1 = sc.nextInt();
            int l2  = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println("Rectangle sum : "+FindSum2(a, l1, r1, l2, r2));
            sc.close();

        }
    }

