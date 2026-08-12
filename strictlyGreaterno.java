import java.util.Scanner;
public class strictlyGreaterno {
    static int strictlygrtr(int[]arr , int x){
        int count  = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]arr = { 1,3,5,6,7,2,5,6,4,2,85};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the value of x");
        int x = sc.nextInt();

        System.out.println("number of elements greater than "+x+ " is : "+strictlygrtr(arr, x));
        sc.close();
    }

}
