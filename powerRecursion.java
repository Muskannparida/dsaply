import java.util.Scanner;
public class powerRecursion {
    static int power(int p , int q){
        if(q == 0){
            return 1;
        }
       return power(p , q-1) * p;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter p :");
        int p = sc.nextInt();
        System.out.println("Enter q:");
        int q = sc.nextInt();
        System.out.println(power(p, q));
        sc.close();
    }

}
