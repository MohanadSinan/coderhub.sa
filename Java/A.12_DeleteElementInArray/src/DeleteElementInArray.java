import java.util.Arrays;

public class DeleteElementInArray {

    public static int[] deleteElementInArray(int[] arr, int index) {
        // write your code here
        int[] anotherArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public static void main(String[] args) {

        System.out.println("arr\t\t\tindex\t\tOutput\n------------------------------");

        int[] array = new int[]{2, 4, 88};
        int index = 2;
        int[] R = deleteElementInArray(array, index);
        System.out.println(Arrays.toString(array) + "\t  " + index + "\t\t\t" + Arrays.toString(R));

        array = new int[]{-3, 4, 0};
        index = 0;
        R = deleteElementInArray(array, index);
        System.out.println(Arrays.toString(array) + "\t  " + index + "\t\t\t" + Arrays.toString(R));
    }

}
