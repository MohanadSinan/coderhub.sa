import java.util.Arrays;

public class Average {

    public static double average(int[] array) {
        // write your code here
        double sum = 0;

        for (int num : array)
            sum += num;

        return (sum / array.length);
    }

    public static void main(String[] args) {

        System.out.println("array\t\t\t\t Output\n----------------------------");

        int[] array1 = new int[]{2, 4, 9, 23, 435};
        double R1 = average(array1);
        System.out.println(Arrays.toString(array1) + "\t  " + R1);

        int[] array2 = new int[]{0, 44, 9, 3, 8};
        double R2 = average(array2);
        System.out.println(Arrays.toString(array2) + "\t  " + R2);

        int[] array3 = new int[]{99, 23};
        double R3 = average(array3);
        System.out.println(Arrays.toString(array3) + "\t\t\t  " + R3);

        int[] array4 = new int[]{72, 86, 23, 70, 1};
        double R4 = average(array4);
        System.out.println(Arrays.toString(array4) + "\t  " + R4);

        int[] array5 = new int[]{55, 2, 96};
        double R5 = average(array5);
        System.out.println(Arrays.toString(array5) + "\t\t\t  " + R5);
    }

}
