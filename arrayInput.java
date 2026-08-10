import java.util.Scanner;
public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[]arr = new int[n];
        
        System.out.println("Enter the array elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing the elemnets of array:");
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }


}
