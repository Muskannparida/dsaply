import java.util.Scanner;
public class arrayReverse {
    static void reverseOfArray(int[]arr){
        System.out.println("Before reversing : ");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("After reversing the array :");
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :" );
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the "+n+ " elements of array :");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseOfArray(arr);
        sc.close();
    }

}
