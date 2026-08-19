import java.util.Scanner;
public class SpiralMatrix {
    static void printArray(int[][]arr){
        for(int i = 0;i<arr.length ; i++){
            for(int j = 0;j<arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][]arr , int r , int c){
        int topRow = 0;
        int bottomRow = r-1;
        int leftCol = 0;
        int rightCol = c-1;

        int totalElements = 0;

        while(totalElements<r*c){
            //printing top row--->leftcolumn to rightcolumn.
            for(int j = leftCol ; j<=rightCol ; j++){
                System.out.print(arr[topRow][j]+" ");
                totalElements++;

            }
            //printing right column---->toprow to bottomrow
            for(int  i = topRow+1; i <= bottomRow ; i++){
                System.out.print(arr[i][rightCol]+" ");
                totalElements++;

            }
            //printing bottom row--->rightcol to left col
            for(int j  = rightCol-1 ; j>=leftCol;j--){
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;

            }
            //printing left column-->  bottom row to toprow
            for(int i = bottomRow-1 ; i>=topRow+1  ; i--){
                System.out.print(arr[i][leftCol]+" ");
                totalElements++;

            }
            topRow++;
        bottomRow--;
        leftCol++;
        rightCol--;

        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int r  =sc.nextInt();
        System.out.println("Enter the no of columns :");
            int c = sc.nextInt();
            int[][]a = new int[r][c];

            int totalElements = r*c;
            System.out.println("totalElement : "+totalElements);

            System.out.println("Enter "+totalElements+" values .");
            for(int i = 0; i<r;i++){
                for(int j = 0;j<c;j++){
                    a[i][j] = sc.nextInt(); 
                }
            }
            System.out.println("Input matrix : ");
            printArray(a);
            
             System.out.println("Spiral order is :");
             printSpiralOrder(a, r, c);
             
             sc.close();

    }


}
