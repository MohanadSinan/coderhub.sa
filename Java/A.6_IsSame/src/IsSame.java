public class IsSame {

    public static String isSame(String name1, String name2) {
        // write your code here
        if (name1.equals(name2)) return "متشابهتين";
        return "غير متشابهتين";
    }

    public static void main(String[] args) {

        System.out.println("name1\t\tname2\t\t   Output\n--------------------------------------");

        var name1 = "Ayman";
        var name2 = "ayman";
        String R1 = isSame(name1, name2);
        System.out.println(name1 + "\t\t" + name2 + "\t\t" + R1);

        name1 = "Amro";
        name2 = "Amrow";
        String R2 = isSame(name1, name2);
        System.out.println(name1 + "\t\t" + name2 + "\t\t" + R2);

        name1 = "Norah";
        name2 = "Norah";
        String R3 = isSame(name1, name2);
        System.out.println(name1 + "\t\t" + name2 + "\t\t" + R3 + "  ");

        name1 = "Mishal";
        name2 = "Anas";
        String R4 = isSame(name1, name2);
        System.out.println(name1 + "\t\t" + name2 + "\t\t" + R4);

        name1 = "Abdullah";
        name2 = "Abdullah";
        String R5 = isSame(name1, name2);
        System.out.println(name1 + "\t" + name2 + "\t"  + R5 + "  ");
    }

}
