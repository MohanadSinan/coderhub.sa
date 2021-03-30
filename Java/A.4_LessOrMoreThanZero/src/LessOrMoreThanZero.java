public class LessOrMoreThanZero {

    public static String lessOrMoreThanZero(int number) {
        // write your code here
        if (number > 0) {
            return "Greater than zero";
        } else {
            return number < 0 ? "Less than zero" : "Equal to zero";
        }
    }

    public static void main(String[] args) {

        System.out.println("a\t\toutput\n-------------------");

        var number = 9;
        String R1 = lessOrMoreThanZero(number);
        System.out.println(number + "\t\t" + R1);

        number = 0;
        String R2 = lessOrMoreThanZero(number);
        System.out.println(number + "\t\t" + R2);

        number = -2;
        String R3 = lessOrMoreThanZero(number);
        System.out.println(number + "\t\t" + R3);

        number = -3;
        String R4 = lessOrMoreThanZero(number);
        System.out.println(number + "\t\t" + R4);

        number = 49;
        String R5 = lessOrMoreThanZero(number);
        System.out.println(number + "\t\t" + R5);
    }

}
