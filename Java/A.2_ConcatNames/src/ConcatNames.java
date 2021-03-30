public class ConcatNames {

    public static String concatNames(String name1, String name2) {
        // write your code here
        return name1 + " " + name2;
    }

    public static void main(String[] args) {

        System.out.println("a\t\tb\t\t\t\toutput\n-----------------------------------");

        var a = "Be";
        var b = "yourself";
        String R1 = concatNames(a, b);
        System.out.println(a + "\t\t" + b + "\t  " + R1);

        a = "Hello";
        b = "World!";
        String R2 = concatNames(a, b);
        System.out.println(a + "\t" + b + "\t\t  " + R2);

        a = "Coffee";
        b = "shop";
        String R3 = concatNames(a, b);
        System.out.println(a + "\t" + b + "\t\t  " + R3);

        a = "Good";
        b = "morning";
        String R4 = concatNames(a, b);
        System.out.println(a + "\t" + b + "\t\t  " + R4);
    }
}
