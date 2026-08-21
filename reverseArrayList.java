import java.util.ArrayList;
public class reverseArrayList {

    static void reverseList(ArrayList<Integer> l1){
        int i = 0;
        int j = l1.size()-1;

        while(i  < j){
            Integer temp = l1.get(i);
            l1.set(i, l1.get(j));
            l1.set(j, temp);
            i++;
            j--;

            
        }
    } 
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(50);
        l1.add(40);
        l1.add(60);
         l1.add(42);
          l1.add(10);

          System.out.println("Original list :"+l1);
          reverseList(l1);
          System.out.println("Reversed list is "+l1);
          
        
    }

}
