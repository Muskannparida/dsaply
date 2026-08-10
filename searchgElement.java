public class searchgElement {
    void eleArray(){
        int[] arr = {1, 5, 3};
        int x = 5;

        int ans = -1;

        for(int i =0;i<arr.length;i++){
            if(arr[i] == x){
                ans = i;  
            }
        }
        System.out.println("found element "+x+ "at position "+(ans+1));
    }
    public static void main(String[] args) {
        searchgElement obj = new searchgElement();
        obj.eleArray();
    }

}
