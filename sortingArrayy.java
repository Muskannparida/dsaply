import java.util.Scanner;
public class sortingArrayy {
    static void swap(int[]arr , int i , int j){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static void sortOddAndEvenByParity(int[]arr ){
        int n = arr.length;
        int  left = 0;
        int  right = n-1;
        
        while(left < right){
            if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 0 ){
                left++;
            }
            if(arr[right] % 2 != 0){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int[]arr = new int[s];
    System.out.println("Enter the elements of array :");
    for(int i = 0;i<s;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Original Array :");
    printArray(arr);

    sortOddAndEvenByParity(arr);
        System.out.println("Sorted array :");
        printArray(arr);
        sc.close();
    
    }

}
