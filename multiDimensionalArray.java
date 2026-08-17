import java.util.Scanner;
public class multiDimensionalArray {
    static void printArray(int[][]arr){
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr[i].length ; j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
       // int[][]arr=  new int[2][3];
        
        //manually storing the values of array.
       // arr[0][0] = 1;
       // arr[1][2] = 3;

        //storing values using array literal.
        // int[][]arr1 = {{1 , 5 , 6} , {3 ,  5  , 7}};
        // printArray(arr1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns ");
        int s = sc.nextInt();
      int[][]arr=  new int[r][s];

      System.out.println("Enter the elemnents of the 2-D Array : " );
      for(int i = 0;i<r;i++){
        for(int j = 0 ;j<s;j++){
            arr[i][j] = sc.nextInt();
        }
      }
      printArray(arr);
      sc.close();

        
    }

}
