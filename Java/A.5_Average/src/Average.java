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

        int[] array = new int[]{2, 4, 9, 23, 435};
        double R = average(array);
        System.out.println(Arrays.toString(array) + "\t  " + R);

        array = new int[]{0, 44, 9, 3, 8};
        R = average(array);
        System.out.println(Arrays.toString(array) + "\t  " + R);

        array = new int[]{99, 23};
        R = average(array);
        System.out.println(Arrays.toString(array) + "\t\t\t  " + R);

        array = new int[]{72, 86, 23, 70, 1};
        R = average(array);
        System.out.println(Arrays.toString(array) + "\t  " + R);

        array = new int[]{55, 2, 96};
        R = average(array);
        System.out.println(Arrays.toString(array) + "\t\t\t  " + R);
    }

}
