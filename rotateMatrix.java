import java.util.Scanner;
public class rotateMatrix {
    static void printArray(int[][]arr){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][]arr , int rows , int cols){
        for(int i = 0;i < rows ; i++){
            for(int j = i ; j < cols ; j++){
                //swap arr[i][j] =====> arr[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }

    static void reverseArray(int[]arr){
        int i = 0;
        int j  =arr.length - 1;

        while(i<j){
            int temp  =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        
    }


    static void rotate90Degrees(int[][]arr , int n ){
        //transpose 
        //reverse each row of transposed array

        transposeInPlace(arr, n, n);  
        System.out.println("The matrix is transposed!");

        //reverse each row of transposed matrix....

        for(int i = 0 ; i<n;i++){
            reverseArray(arr[i]);
        }

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

            rotate90Degrees(a, r);

            System.out.println("Rotation of matrix : ");
            printArray(a);
            sc.close();

}
}
