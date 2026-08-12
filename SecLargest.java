import java.util.Scanner;

public class SecLargest {
    static int findLargest(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
    static int findSecondMax(int[]arr){
        int max = findLargest(arr);

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findLargest(arr);

        return secondMax;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array :");
    int z = sc.nextInt();
    int []arr = new int[z];
    System.out.println("Enter the elements of array :");
    for(int i = 0;i<z;i++){
        arr[i] = sc.nextInt();
    } 
    System.out.println("Second maximum element : "+findSecondMax(arr));
    sc.close();  
    }

}
