import java.util.Arrays;
public class move0ToEnd {
 static void pushZerosToEnd(int[] arr) {
        int j = 0; 
        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        // Fill the remaining positions with zeros
        while (j < arr.length) {
            arr[j++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 9, 0};
        System.out.println("after pushing 0s to end :");
        pushZerosToEnd(arr);

}
}

