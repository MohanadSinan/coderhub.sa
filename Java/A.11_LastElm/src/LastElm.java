import java.util.Arrays;

public class LastElm {

    public static int lastElm(int[] arr) {
        // write your code here
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {

        System.out.println("array\t\t\t\t\tOutput\n-------------------------------");

        int[] array1 = new int[]{2 , 4 , 9 , 23 , 435};
        int R1 = lastElm(array1);
        System.out.println(Arrays.toString(array1) + "\t\t  " + R1);

        int[] array2 = new int[]{32 , 44 , 9 , 3 , 8};
        int R2 = lastElm(array2);
        System.out.println(Arrays.toString(array2) + "\t\t  " + R2);

        int[] array3 = new int[]{99 , 314 , 8 , 200 , 23};
        int R3 = lastElm(array3);
        System.out.println(Arrays.toString(array3) + "\t  " + R3);

        int[] array4 = new int[]{72 , 86 , 23 , 70 , 1};
        int R4 = lastElm(array4);
        System.out.println(Arrays.toString(array4) + "\t\t  " + R4);

        int[] array5 = new int[]{55 , 64 , 0 , 11 , 4};
        int R5 = lastElm(array5);
        System.out.println(Arrays.toString(array5) + "\t\t  " + R5);
    }

}
