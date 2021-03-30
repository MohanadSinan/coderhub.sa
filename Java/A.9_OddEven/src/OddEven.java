public class OddEven {

    public static String oddEven(int number) {
        // write your code here
        if (number % 2 == 0) return "زوجي";
        return "فردي";
    }

    public static void main(String[] args) {

        System.out.println("number\t\tOutput\n-------------------");

        int number = 9;
        String R = oddEven(number);
        System.out.println(number + "\t\t\t" + R + " ");

        number = 1;
        R = oddEven(number);
        System.out.println(number + "\t\t\t" + R + " ");

        number = 20;
        R = oddEven(number);
        System.out.println(number + "\t\t\t" + R + " ");

        number = 3;
        R = oddEven(number);
        System.out.println(number + "\t\t\t" + R + " ");

        number = 48;
        R = oddEven(number);
        System.out.println(number + "\t\t\t" + R + " ");
    }

}
