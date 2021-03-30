import java.util.Arrays;

public class LargestSmallest {

    public static int[] largestSmallest(int[] array) {
        // write your code here
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        return new int[]{max, min};
    }

    public static void main(String[] args) {

        System.out.println("array\t\t\t\t\tOutput\n---------------------------------");

        int[] array = new int[]{2 , 4 , 9 , 23 , 435};
        int[] R = largestSmallest(array);
        System.out.println(Arrays.toString(array) + "\t\t" + Arrays.toString(R));

        array = new int[]{32 , 44 , 9 , 3 , 8};
        R = largestSmallest(array);
        System.out.println(Arrays.toString(array) + "\t\t" + Arrays.toString(R));

        array = new int[]{99 , 314 , 8 , 200 , 23};
        R = largestSmallest(array);
        System.out.println(Arrays.toString(array) + "\t" + Arrays.toString(R));

        array = new int[]{72 , 86 , 23 , 70 , 1};
        R = largestSmallest(array);
        System.out.println(Arrays.toString(array) + "\t\t" + Arrays.toString(R));

        array = new int[]{55 , 64 , 0 , 11 , 4};
        R = largestSmallest(array);
        System.out.println(Arrays.toString(array) + "\t\t" + Arrays.toString(R));
    }

}
