package basics.methods;

public class FirstMethod {
    public static void main(String[] args) {

        double radius= 3;
        double circleArea = calculateCircleArea(radius);
        System.out.println(circleArea);


    }
    // public is a kind of access to the method
    // static key means the method belongs to the class
    // double is the type of value that returns the method
    // and radius is a parameter of the method

    // modifier returnType methodName( parameter list){
    // method body
    //};
    public static double calculateCircleArea(double radius){
        return 3.14 * radius * radius;
    }
}
