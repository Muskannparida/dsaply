import java.util.Scanner;

public class ArrayR {
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // safe rotation
        int[] ans = new int[n];
        int j = 0;

        // last k elements first
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        // remaining elements
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int z = sc.nextInt();
        int[] arr = new int[z];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < z; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter rotation steps (k):");
        int k = sc.nextInt();

        System.out.println("Array before rotation:");
        for (int i = 0; i < z; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // store rotated array
        arr = rotate(arr, k);

        System.out.println("Array after rotation:");
        for (int i = 0; i < z; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
