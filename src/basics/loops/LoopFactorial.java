package basics.loops;

public class LoopFactorial {
    public static void main(String[] args) {
        int num = 5; // do NOT change this line
        int factorial = 1;

        /*
            TODO
            Write a 'for' loop to calculate a factorial of the 'num'
            For example, if 'num' equals 5, then factorial of 'num' is 1 * 2 * 3 * 4 * 5
        */
        for (int i = 1 ; i <= num ; i++){
            factorial *= i;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);

    }
}
