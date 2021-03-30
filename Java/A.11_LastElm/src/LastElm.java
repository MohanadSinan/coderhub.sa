import java.util.Arrays;

public class LastElm {

    public static int lastElm(int[] arr) {
        // write your code here
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {

        System.out.println("array\t\t\t\t\tOutput\n------------------------------");

        int[] array = new int[]{2 , 4 , 9 , 23 , 435};
        int R = lastElm(array);
        System.out.println(Arrays.toString(array) + "\t\t  " + R);

        array = new int[]{32 , 44 , 9 , 3 , 8};
        R = lastElm(array);
        System.out.println(Arrays.toString(array) + "\t\t  " + R);

        array = new int[]{99 , 314 , 8 , 200 , 23};
        R = lastElm(array);
        System.out.println(Arrays.toString(array) + "\t  " + R);

        array = new int[]{72 , 86 , 23 , 70 , 1};
        R = lastElm(array);
        System.out.println(Arrays.toString(array) + "\t\t  " + R);

        array = new int[]{55 , 64 , 0 , 11 , 4};
        R = lastElm(array);
        System.out.println(Arrays.toString(array) + "\t\t  " + R);
    }

}
