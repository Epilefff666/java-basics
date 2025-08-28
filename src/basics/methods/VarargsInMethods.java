package basics.methods;

public class VarargsInMethods {
    public static void main(String[] args) {
        printVarargVariables();
        printVarargVariables(5);
        printVarargVariables(1,2,3,4,5);

    }

    //varargs is the way to declare parameters in a method like the follow example

    public static void printVarargVariables(int... numbers){
        for( int number : numbers){
            System.out.println(number);
        }
    }

}
