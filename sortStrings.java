import java.util.ArrayList;
import java.util.Collections;
public class sortStrings {
    static void sortArrayList(ArrayList<String>s1) {
        Collections.sort(s1);
    }
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Muskan");
        s1.add("eva");
        s1.add("Ram");
        s1.add("manvi");
        System.out.println("Original list :"+s1);
        sortArrayList(s1);
        System.out.println("Sorted Array : ");
         
   
    }
}
