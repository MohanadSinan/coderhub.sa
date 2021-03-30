public class DivRemainder {

    public static long divRemainder(int a, int b) {
        // write your code here
        return a % b;
    }

    public static void main(String[] args) {

        System.out.println("a\tb\t\toutput\n-------------------");

        var a = 1;
        var b = 1;
        long R1 = divRemainder(a, b);
        System.out.println(a + "\t" + b + "\t\t  " + R1);

        a = 9;
        b = 5;
        long R2 = divRemainder(a, b);
        System.out.println(a + "\t" + b + "\t\t  " + R2);

        a = 15;
        b = 10;
        long R3 = divRemainder(a, b);
        System.out.println(a + "\t" + b + "\t\t  " + R3);

        a = 99;
        b = 4;
        long R4 = divRemainder(a, b);
        System.out.println(a + "\t" + b + "\t\t  " + R4);
    }

}
