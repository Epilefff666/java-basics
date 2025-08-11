package basics.datatypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //the  byte data type can store a whole number between -128 and 127
        byte age = 25;

        //the short data type can store a whole number between -32,768 and 32,767
        short year = 2025;

        //the int data type can store a whole number between -2,147,483,648 and 2,147,483,647
        int population = 10000000;

        //the long data type can store a whole number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807
        long distance = 1000000000;

        // the float data type can hold a value from 1.4e-045 to 3.4028235e+308
        float weight = 68.5f; // "f" is important because it represents float, if this character is not here the default value is double

        //the double data type can hold a value from 4.9e-324 to 1.7976931348623157e+308
        double height = 178.6; // it has double precision

        // A character data type, also know as char, is used to store a single character, such as a letter, number, or symbol
        char grade = 'A';

        // the Unicode value for the letter a is 65, so we could also initialize the char variable as:
        char grade2= 65;

        //the boolean data type is used to store a true or false value
        boolean isStudent = true;

        //CASTING IN JAVA
        // - EXPLICIT CASTING AND IMPLICIT CASTING
        //explicit
        float f = 3.14f;
        int e = (int)f;

        //implicit also known as "type promotion"
        byte age2 =10;
        int age3 = age2;

    }
}
