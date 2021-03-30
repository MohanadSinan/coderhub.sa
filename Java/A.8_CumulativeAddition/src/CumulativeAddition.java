import java.util.Arrays;

public class CumulativeAddition {

    public static int[] cumulativeAddition(int[] array) {
        // write your code here
        int sum = Arrays.stream(array).sum();
        return new int[]{sum, array.length};
    }

    public static void main(String[] args) {

        System.out.println("array\t\t\t\t\t\t Output\n--------------------------------------");

        int[] array1 = new int[]{2, 4, 9, 23, 435};
        int[] R1 = cumulativeAddition(array1);
        System.out.println(Arrays.toString(array1) + "\t\t\t " + Arrays.toString(R1));

        int[] array2 = new int[]{32, 9, 3, 8};
        int[] R2 = cumulativeAddition(array2);
        System.out.println(Arrays.toString(array2) + "\t\t\t\t " + Arrays.toString(R2));

        int[] array3 = new int[]{99, 314, 8, 200, 23, 2};
        int[] R3 = cumulativeAddition(array3);
        System.out.println(Arrays.toString(array3) + "\t " + Arrays.toString(R3));

        int[] array4 = new int[]{72, 86};
        int[] R4 = cumulativeAddition(array4);
        System.out.println(Arrays.toString(array4) + "\t\t\t\t\t " + Arrays.toString(R4));

        int[] array5 = new int[]{55};
        int[] R5 = cumulativeAddition(array5);
        System.out.println(Arrays.toString(array5) + "\t\t\t\t\t\t " + Arrays.toString(R5));
    }

}
