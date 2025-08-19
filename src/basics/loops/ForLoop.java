package basics.loops;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("A for loop that counts from 5 to 15 in increments of 2");

        for ( int i= 5;  i <= 15 ; i +=2){
            System.out.println(i);
        }

        System.out.println("A for loop that count from 10 to 1");

        for(int i= 10 ; i >= 1 ; i--){
            System.out.println(i);
        }

        System.out.println("A for loop that prints out first ten even number");

        for (int i = 2 ; i <= 20 ; i+=2 ){
            System.out.println(i);
        }

        System.out.println("A for loop that calculates the factorial of a given number");

        int num = 5;
        int factorial = 1;
        for (int i = 1 ; i <= num ; i++){
            factorial *= i;
        }

        System.out.println("the factorial of "+num+" is "+ factorial);
    }
}
