import java.util.Scanner;
public class Factorial {
    static int printFactorial(int n){
        if(n == 0){
            return 1;
        }

        int ans = printFactorial(n-1);
        return n*ans;
    }
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n :");
    int n = sc.nextInt();
    System.out.println(printFactorial(n));

    sc.close();

}
}

