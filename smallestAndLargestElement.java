import java.util.Arrays;
import java.util.Scanner;

public class smallestAndLargestElement {
    static void smallAndLarge(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Smallest element: " + arr[0]);
        System.out.println("Largest element: " + arr[arr.length - 1]);
    }
    static int[]Array(int[]arr){
        Arrays.sort(arr);
        int[]ans = {arr[0] , arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
 
 
        smallAndLarge(arr);
        int[]ans = Array(arr);
        System.out.println(Array(arr));
        System.out.println(Arrays.toString(ans));
        
    sc.close();
        
        
    }
    
}
