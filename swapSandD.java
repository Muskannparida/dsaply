import java.util.Scanner;
public class swapSandD {
    static void swapSumAndDiff(int a , int b){
        System.out.println("original value before swapping :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a= a+b; //a = 9 , b =3 || a = 9+3 = 12
        b = a-b; // b = 12-3= 9 (swapped)
        a = a-b; // a = 12-9 = 3
        System.out.println("Values after swapping are :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a  = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        swapSumAndDiff(a, b);
        sc.close();
    }


}
