import java.util.ArrayList;
public class ArrayList1 {
    

    public static void main(String[] args) {
        //Wrapper Classes.
    Integer in = Integer.valueOf(4);
    System.out.println(in);
    Float f =  Float.valueOf(4.5f);
    System.out.println(f);

    ArrayList<Integer>l1 = new ArrayList<>();
    
    //how to add element???
    l1.add(5);
    l1.add(6);
    l1.add(7);
    l1.add(8);

    //to access an element at ith index
    System.out.println(l1.get(1));

    //print with for loop
    for(int i = 0 ; i <l1.size() ; i++){
        System.out.println(l1.get(i));   // 5 6 7 8 should be printed.
    }
    //printing the arraylist directly.
    System.out.println(l1);

    //adding element at index i.
    l1.add(1 , 100);
    System.out.println(l1); //[5 ,100 , 6 , 7 , 8]

    //changing or modifying element at index i.
    l1.set(1, 50);
    System.out.println(l1);// [5 50 6 7 8]

    //removing an element at index i.
    l1.remove(1);
    System.out.println(l1);

    //removing an element e .(if we don't know the index but we want to remove that element).
    l1.remove(Integer.valueOf(8));
    System.out.println(l1);

    //checking if an element exist
    boolean ans = l1.contains(Integer.valueOf(8));
    System.out.println(ans);
    boolean ans1 = l1.contains(Integer.valueOf(5));
    System.out.println(ans1);

    //if you don't specify class , you can put anything inside l1
    // ArrayList l = new ArrayList();
    // l.add("partha");
    // l.add(4);
    // l.add(true);
    // System.out.println(l);



}
}
