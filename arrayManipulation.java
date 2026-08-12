import java.util.Scanner;
public class arrayManipulation {
 static int findUnique(int[]arr){
    int n = arr.length;
    int count= 0;
    for(int i = 0 ; i< n ; i++){
        for(int j = i + 1 ; j < n ; j++){
            if(arr[i] == arr[j]){
                arr[i] = -1;
                arr[j] = -1;
            }
        }
    }
    for(int i= 0 ; i<n; i++){
        if(arr[i]>0){
            count = arr[i];
        }
    }
    return count;

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
    System.out.println("The unique elements is :"+findUnique(arr));
    sc.close();  
 }

}
