package oop.objects.statickeyword;

public class Main {
    public static void main(String[] args) {

        // Accessing the static variable PI directly through the class name (MathHelper).
        // This avoids the need to create an object of MathHelper.
        // Since PI is static, it's shared across all instances of the class.
        /*
         * Tip:
         * - If PI is declared as 'public static final', it represents a true constant.
         * - In that case, its naming convention should be uppercase: PI
         * - Example declaration: public static final double PI = 3.14159;
         */
        System.out.println("The value of PI is: " + MathHelper.PI);



        /*
         * Example of calling a static method:
         *
         * - We call MathHelper.square(5) directly, without creating
         *   an instance of MathHelper.
         * - This works because 'square' is a static method, so it
         *   belongs to the class itself, not to any specific object.
         * - The result of 5 * 5 is stored in squareResult and printed.
         */
        int squareResult = MathHelper.square(5);
        System.out.println(squareResult);

    }
}
