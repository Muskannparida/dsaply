import java.util.Scanner;
public class lastOccurrence {
    static int lastOccur(int[]arr , int x){
        int lastIndex = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr1 = {2 , 4 , 5 , 2 , 6 , 2 , 7};
        System.out.println("Enter the value of x :");
        int x = sc.nextInt();
        System.out.println("Last occurrence of "+x+" is :"+lastOccur(arr1, x));
    }
}
