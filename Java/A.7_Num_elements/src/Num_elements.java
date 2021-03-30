import java.util.Arrays;

public class Num_elements {

    public static int num_elements(int[] array) {
        // write your code here
        return array.length;
    }

    public static void main(String[] args) {
        System.out.println("array\t\t\t\t\t\t\tOutput\n---------------------------------------");

        int[] array = new int[]{2 , 4 , 9 , 23 , 435};
        int R = num_elements(array);
        System.out.println(Arrays.toString(array) + "\t\t\t\t  " + R);

        array = new int[]{32 , 44 , 9 , 3 , 8, 1};
        R = num_elements(array);
        System.out.println(Arrays.toString(array) + "\t\t\t  " + R);

        array = new int[]{99 , 314 , 10, 11, 8 , 200 , 23};
        R = num_elements(array);
        System.out.println(Arrays.toString(array) + "\t  " + R);

        array = new int[]{72 , 86};
        R = num_elements(array);
        System.out.println(Arrays.toString(array) + "\t\t\t\t\t\t  " + R);

        array = new int[]{55 , 64 , 0 , 11 };
        R = num_elements(array);
        System.out.println(Arrays.toString(array) + "\t\t\t\t\t  " + R);
    }

}
