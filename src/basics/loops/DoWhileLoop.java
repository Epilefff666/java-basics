package basics.loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter a positive number");
            num = scanner.nextInt();
        }while(num <= 0 );
        System.out.println("Thank you");

    }
}
