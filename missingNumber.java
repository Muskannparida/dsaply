 import java.util.Arrays;
public class missingNumber {
   

    private static int missingNumber(int arr[])
    {
        Arrays.sort(arr);
        int smallest = 1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==smallest)
                smallest++;
            else if(arr[i]>smallest) break;

        }
        
        return smallest;
    }
    public static void main(String[] args) {
        int []arr=new int[]{2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr));
    }
    

}
