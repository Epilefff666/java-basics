package basics.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 5;
        x += 3; // x = x + 3
        System.out.println(x);

        x -= 3; // x = x - 3
        System.out.println(x);

        x *= 3; // x = x * 3
        System.out.println(x);

        x /=3; // x = x / 3
        System.out.println(x);

        String name = "Felipe";
        name += " Flores"; // name = name + "Flores"
        System.out.println(name);

        double num = 3.14;
        num *= 2;
        System.out.println(num);
    }
}
