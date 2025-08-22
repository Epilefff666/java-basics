package basics.methods;

import java.util.Scanner;

public class SimpleMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the first value");
        int a = input.nextInt();

        System.out.println("enter the second value");
        int b = input.nextInt();

        System.out.println("the addition operation whit both values is: "+ addNumber(a,b));

    }

    public static int addNumber(int a , int b){
        return a + b;
    }
}
