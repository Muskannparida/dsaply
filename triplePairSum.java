import java.util.Scanner;
public class triplePairSum {
    static int countTriplePair(int[]arr , int target){
        int n = arr.length;
        int count= 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1 ; k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the "+n+" elements of the array:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the target sum:");
        int m = sc.nextInt();
        System.out.println("The numebr of the pair of triplets whose sum is "+m+ " is :"+countTriplePair(arr, m));
        sc.close();
    }

}
