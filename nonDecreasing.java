import java.util.Scanner;
public class nonDecreasing {
    static void reverseArray(int[]arr){
        int n = arr.length;
        for(int  i = n-1; i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void printArray(int[]arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static int[] sortSquares(int[]arr){
        int left = 0;
        int right = arr.length-1;
        int[]ans = new int[arr.length];
        int k = 0; //for or traversal of answer array

        while(left <= right){
            if(Math.abs(arr[left])  >  Math.abs(arr[right])){
                ans[k] = arr[left]* arr[left]; 
                k++;
                left++;
            }else{
                ans[k] = arr[right] * arr[right];
                k++;
                right--;
            }
        }
        return ans;
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

    int[] ans = sortSquares(arr);
        System.out.println("Sorted array :");
        reverseArray(ans);
       
        sc.close();

}
}
