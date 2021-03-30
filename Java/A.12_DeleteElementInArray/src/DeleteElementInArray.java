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

        int[] array1 = new int[]{2, 4, 88};
        int index1 = 2;
        int[] R1 = deleteElementInArray(array1, index1);
        System.out.println(Arrays.toString(array1) + "\t  " + index1 + "\t\t\t" + Arrays.toString(R1));

        int[] array2 = new int[]{-3, 4, 0};
        int index2 = 0;
        int[] R2 = deleteElementInArray(array2, index2);
        System.out.println(Arrays.toString(array2) + "\t  " + index2 + "\t\t\t" + Arrays.toString(R2));
    }

}
