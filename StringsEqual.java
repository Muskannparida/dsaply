import java.util.Scanner;
public class StringsEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Identical");
        } else {
            System.out.println("Not Identical");
        }
        sc.close();
    }
}


