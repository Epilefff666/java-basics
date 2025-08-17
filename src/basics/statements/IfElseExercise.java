package basics.statements;

public class IfElseExercise {
    public static void main(String[] args) {
        int number = -3;

        /*
            TODO:
            if the number is positive, print "The number is positive"
            if the number is negative, print "The number is negative"
            if the number is zero, print "The number is zero"
        */

        if( number > 0){
            System.out.println("The number is positive");
        }else if (number < 0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is zero");
        }
    }
}
