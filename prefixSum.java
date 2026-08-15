import java.util.Scanner;
public class prefixSum {
    static void printArray(int[]arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] makePrefixSum(int[]arr){
        int[]pref = new int[arr.length];
        pref[0] = arr[0];
        for(int i = 1 ; i< arr.length ; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[]arr = new int[n];
        
        System.out.println("Enter the elemnets of the array :");
        for(int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("original array :");
        printArray(arr);

        int[]pref = makePrefixSum(arr);
        System.out.println("Prefix array is :");
        printArray(pref);
        sc.close();
        
        
    }
    
}
