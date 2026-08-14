import java.util.Scanner;

public class method {

    static void swap(int[]arr,int i , int j){
       int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void sortZeroAndOne(int[]arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;

            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter " + n + " elements (only 0 and 1):");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println("Original Array:");
    printArray(arr);

    sortZeroAndOne(arr);

    System.out.println("Sorted Array:");
    printArray(arr);

    sc.close();
}


}
