import java.util.Scanner;
public class noOfOccurrence {
    static int countOfOccurrence(int[]arr , int x){
        int count= 0;
        for (int i = 0; i < arr.length ; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int[]arr = new int[5];
        System.out.println("Enter the elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the value of x:");
        int x = sc.nextInt();

        System.out.println("Count of x:" +countOfOccurrence(arr, x));



        }
    }


