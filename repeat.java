import java.util.Scanner;

public class repeat {
    static int firstRepeatingNumbers(int[]arr){
        int n = arr.length;
        for(int i = 0 ; i< n;i++){
            for(int j = i+1 ; j< n ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
    
    return -1;

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
    System.out.println("first value that is repeating is :"+firstRepeatingNumbers(arr));
    sc.close();  
}
}
