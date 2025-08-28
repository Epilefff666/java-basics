package basics.methods;

public class SumNumbers {
    public static void main(String[] args) {
        int number1 = 12; // do NOT change this line
        int number2 = 5; // do NOT change this line

        int result = sum(number1,number2);

        // TODO: assign the result of the 'sum' method, called with 'number1' and 'number2' arguments to the 'result' variable

        System.out.println("The sum is: " + result);
    }
    public static int sum(int n1 , int n2){
        return n1+n2;
    }
}
