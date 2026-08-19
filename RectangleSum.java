import java.util.Scanner;
public class RectangleSum {
    static int FindSum(int[][]arr , int l1 , int r1 , int l2 , int r2){
        int sum = 0;
        for(int i = l1; i<=l2 ;i++){
            for(int j = r1 ; j<=r2; j++){
                sum += arr[i][j];
            }
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

            System.out.println("Rectangle sum : "+FindSum(a, l1, r1, l2, r2));
            sc.close();

        }
    }
