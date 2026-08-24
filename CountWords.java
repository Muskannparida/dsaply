import java.util.Scanner;
public class CountWords {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strg = sc.nextLine();

        if (strg.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = strg.trim().split("\\s+");
            System.out.println(words.length);
        }
        sc.close();
    }
}


