package basics.strings;

public class StringObjects {
    public static void main(String[] args) {

        String s = "Hello world";

        // it helps to know the length of the string
        int length = s.length();
        System.out.println("The length of the string is: "+ length);

        //it helps to know the character in an specific position of the string
        char c = s.charAt(0);
        System.out.println("The first character in the string is: "+ c);

        // it helps to find the index position of a specific character
        int index = s.indexOf('w');
        System.out.println("the first occurrence of 'w' is at index: "+ index);

        // a string is inmutable, whe a string is modified it returns a new value that means a new object like the follow example
        String s1 = "hello";
        String s2 = "world";
        String newString = s1 +s2;
        System.out.println(newString);


    }
}
