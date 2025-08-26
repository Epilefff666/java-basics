package basics.methods;

public class RecursiveMethods {
    public static void main(String[] args) {
     int num = 5 ;
        System.out.println("Factorial of "+num+" is: "+factorial(5));


    }

    //factorial of a number n is defined as n! = n * ( n - 1 ) * ( n - 2 ) * ....* 1

    public static int factorial ( int n ){
       if( n == 0){
           return 1;
       }else{
           return n * factorial(n -1 );
       }
    }

}
