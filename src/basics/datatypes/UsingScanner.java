package basics.datatypes;
import java.util.Scanner;
public class UsingScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int num = input.nextInt();
        System.out.println("you entered: "+ num);
    }
}
