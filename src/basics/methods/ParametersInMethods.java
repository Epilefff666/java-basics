package basics.methods;

public class ParametersInMethods {
    public static void main(String[] args) {
        addNumbers(10,12);
        printMessage("This is a message printed using printMessage method");
    }

    //list od parameters in a method i separate whit comas "method(int num1 ,int num2, int num3){ //body; }"

    public static void addNumbers(int num1, int num2){
        int sum =num1+num2;
        System.out.println("The sum is: "+sum);
    }

    public static void printMessage(String message){
        System.out.println(message);
    }

}
