package oop.objects.statickeyword;

public class MathHelper {


    // A static variable belongs to the class rather than an instance.
    // This means all objects of this class will share the same PI value.
    /*
     * Note:
     * - Since PI represents a mathematical constant,
     *   the best practice in Java is to declare it as 'static final'
     *   so its value cannot be changed accidentally.
     * - Constants are conventionally written in UPPERCASE.
     *
     * Example:
     * public static final double PI = 3.14159;
     */
    static double PI = 3.14;



    /*
     * This class demonstrates the use of the 'static' keyword.
     *
     * - The method square(int number) is declared as static.
     * - Static methods belong to the class itself, not to instances of the class.
     * - Therefore, you can call this method without creating a MathHelper object.
     *   Example: MathHelper.square(5);
     *
     * Static methods are commonly used for utility/helper methods
     * that do not depend on the state (fields) of an instance.
     */
    static int square(int number) {
        return number * number;
    }

}
