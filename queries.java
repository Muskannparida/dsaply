import java.util.Scanner; 
public class queries {
    static int[] makePrefixSumArray(int[]arr){
        int[]pref = new int[arr.length];
        for(int i = 1 ; i<arr.length;i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int[]arr=  new int[n+1];

        System.out.println("Enter "+n+ " elements :");
        for(int i = 1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        int[]pref = makePrefixSumArray(arr);
        System.out.println("Enter number of queries :");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter the range :");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans  = pref[r] - pref[l-1];
            System.out.println("Sum is :"+ans);

            sc.close();
        }


    }

}
