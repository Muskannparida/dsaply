import java.util.Scanner;
public class presentQuery {
    static int[] makeFrequencyArray(int[]arr){
        int[]freq = new int[100005];

        for(int i = 0 ; i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
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
    int[]freq = makeFrequencyArray(arr);
    System.out.println("Enter the number of queries : ");
    int q = sc.nextInt();
    while (q>0){
        System.out.print("Enter number to be searched :");
        int x = sc.nextInt();
        if(freq[x] >0){
            System.out.println("yes!");
        }else{
            System.out.println("No!");
        }
        q--;
    }
    sc.close();
    }

}
