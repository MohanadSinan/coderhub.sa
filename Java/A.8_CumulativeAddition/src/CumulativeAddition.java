import java.util.Arrays;

public class CumulativeAddition {

    public static int[] cumulativeAddition(int[] array) {
        // write your code here
        int sum = Arrays.stream(array).sum();
        return new int[]{sum, array.length};
    }

    public static void main(String[] args) {

        System.out.println("array\t\t\t\t\t\t Output\n--------------------------------------");

        int[] array = new int[]{2, 4, 9, 23, 435};
        int[] R = cumulativeAddition(array);
        System.out.println(Arrays.toString(array) + "\t\t\t " + Arrays.toString(R));

        array = new int[]{32, 9, 3, 8};
        R = cumulativeAddition(array);
        System.out.println(Arrays.toString(array) + "\t\t\t\t " + Arrays.toString(R));

        array = new int[]{99, 314, 8, 200, 23, 2};
        R = cumulativeAddition(array);
        System.out.println(Arrays.toString(array) + "\t " + Arrays.toString(R));

        array = new int[]{72, 86};
        R = cumulativeAddition(array);
        System.out.println(Arrays.toString(array) + "\t\t\t\t\t " + Arrays.toString(R));

        array = new int[]{55};
        R = cumulativeAddition(array);
        System.out.println(Arrays.toString(array) + "\t\t\t\t\t\t " + Arrays.toString(R));
    }

}
