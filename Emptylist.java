import java.util.ArrayList;
public class Emptylist {
    public static void main(String[] args) {
        ArrayList<Integer>l2 = new ArrayList<>();
        l2.add(40);
        l2.add(20);

        //to check if its empty .
       boolean ans2 =  l2.isEmpty();
       System.out.println(ans2);

        int in = l2.indexOf(20);
       System.out.println(in);

       int in3 = l2.lastIndexOf(40);
       System.out.println(in3);

        
    }
    
}

