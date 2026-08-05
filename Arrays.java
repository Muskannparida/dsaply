public class Arrays {
    void demoArrays() {
        int[] ages = new int[5];
        float[] weight = new float[3];
        String[] names = {"rahul", "raj", "ira"};
    }

    void multiArray() {
        int[][] arr1 = new int[5][5];
        arr1[0][0] = 1;
        System.out.println(arr1[0][0]);
        System.out.println(arr1.length);  
    }

    public static void main(String[] args) {
        Arrays obj = new Arrays();
        obj.demoArrays();
        obj.multiArray();
    }
}

