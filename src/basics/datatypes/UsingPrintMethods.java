package basics.datatypes;

public class UsingPrintMethods {
    public static void main(String[] args) {
        int number = 42;
        double price = 12.99;
        boolean isAvailable = true;
        char grade = 'A';
        String name = "Alice";

        // Use print and println methods here
        System.out.print("Number: ");
        System.out.println(number);
        System.out.println("Price: "+ price);
        System.out.println("Availability: "+isAvailable);
        System.out.println("Grade: "+grade);
        System.out.println("Name: "+name);
        // Use printf method here
        System.out.printf("Formatted Output: Name: %s, Number: %d, Price: %.2f, Availability: %s, Grade: %s",name,number,price,isAvailable,grade);

    }
}
