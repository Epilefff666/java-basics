package basics.strings;

public class StringFormat {
    public static void main(String[] args) {

        String name = "Felipe";
        int age = 25;

        // String.format() is used to build formatted strings.
        // It works similarly to printf: placeholders (%s, %d, etc.) are replaced by provided values.
        // %s -> string, %d -> integer, %f -> floating point, etc.
        String result = String.format("My name is %s and I am %d years old", name, age);
        System.out.println(result);

        // System.out.printf() prints directly to the console with formatting support.
        // Unlike String.format(), it doesn’t create a new string—it writes the formatted output immediately.
        System.out.printf("Hello %s", name);

    }
}
