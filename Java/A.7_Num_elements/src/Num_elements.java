import java.util.Arrays;

public class Num_elements {

    public static int num_elements(int[] array) {
        // write your code here
        return array.length;
    }

    public static void main(String[] args) {
        System.out.println("array\t\t\t\t\t\t\tOutput\n---------------------------------------");

        int[] array1 = new int[]{2 , 4 , 9 , 23 , 435};
        int R1 = num_elements(array1);
        System.out.println(Arrays.toString(array1) + "\t\t\t\t  " + R1);

        int[] array2 = new int[]{32 , 44 , 9 , 3 , 8, 1};
        int R2 = num_elements(array2);
        System.out.println(Arrays.toString(array2) + "\t\t\t  " + R2);

        int[] array3 = new int[]{99 , 314 , 10, 11, 8 , 200 , 23};
        int R3 = num_elements(array3);
        System.out.println(Arrays.toString(array3) + "\t  " + R3);

        int[] array4 = new int[]{72 , 86};
        int R4 = num_elements(array4);
        System.out.println(Arrays.toString(array4) + "\t\t\t\t\t\t  " + R4);

        int[] array5 = new int[]{55 , 64 , 0 , 11 };
        int R5 = num_elements(array5);
        System.out.println(Arrays.toString(array5) + "\t\t\t\t\t  " + R5);
    }

}
