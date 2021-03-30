public class OddEven {

    public static String oddEven(int number) {
        // write your code here
        if (number % 2 == 0) return "زوجي";
        return "فردي";
    }

    public static void main(String[] args) {

        System.out.println("number\t\tOutput\n--------------------");

        int number1 = 9;
        String R1 = oddEven(number1);
        System.out.println(number1 + "\t\t\t" + R1 + " ");

        int number2 = 1;
        String R2 = oddEven(number2);
        System.out.println(number2 + "\t\t\t" + R2 + " ");

        int number3 = 20;
        String R3 = oddEven(number3);
        System.out.println(number3 + "\t\t\t" + R3 + " ");

        int number4 = 3;
        String R4 = oddEven(number4);
        System.out.println(number4 + "\t\t\t" + R4 + " ");

        int number5 = 48;
        String R5 = oddEven(number5);
        System.out.println(number5 + "\t\t\t" + R5 + " ");
    }

}
