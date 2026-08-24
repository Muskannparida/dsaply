import java.util.Scanner;
public class StringDuplicate {
    static String removeDuplicates(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                ans += str.charAt(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(removeDuplicates(str));
        sc.close();
    }
}

