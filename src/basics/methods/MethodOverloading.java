package basics.methods;

public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add(2.1,1.5));

    }
    // both of the allows methods have the same name but different parameters
    // that is possible and help us to be more practice

    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
}
