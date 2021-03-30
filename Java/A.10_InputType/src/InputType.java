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

        var value = "Hello everybody";
        String R = inputType(value);
        System.out.println(value + "\t\t" + R);

        value = "323";
        R = inputType(value);
        System.out.println(value + "\t\t\t\t\t" + R);

        value = "21.1";
        R = inputType(value);
        System.out.println(value + "\t\t\t\t" + R);
    }

}
