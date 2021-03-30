public class InputType {

    public static String inputType(String value) {
        // write your code here
        if (value.matches("\\d+")) {
            return "integer";
        }

        // checking for floating point numbers
        else if (value.matches("\\d*[.]\\d+")) {
            return  "double";
        }
        return "string";
    }

    public static void main(String[] args) {

        System.out.println("number\t\t\t\tOutput\n---------------------------");

        var value1 = "Hello everybody";
        String R1 = inputType(value1);
        System.out.println(value1 + "\t\t" + R1);

        String value2 = "323";
        String R2 = inputType(value2);
        System.out.println(value2 + "\t\t\t\t\t" + R2);

        String value3 = "21.1";
        String R3 = inputType(value3);
        System.out.println(value3 + "\t\t\t\t" + R3);
    }

}
