import java.util.Scanner;
public class RecursiveNaturalNumbers {
    static void printDecreasing(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        //self work .
        System.out.println(n);
        printDecreasing(n-1);


}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value fo n : ");
    int n = sc.nextInt();
    printDecreasing(n);
    sc.close();
    
}
}