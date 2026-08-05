public class sumofele {
    int[] arr = {1, 5, 3};
    int sum = 0;

    public void calculateSum() {
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("sum of the array is:"+sum);
        }
    }
    public static void main(String[] args) {
        sumofele obj = new sumofele();
        obj.calculateSum();
    }
}
