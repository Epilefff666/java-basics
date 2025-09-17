package basics.strings;

public class StringPool {
    public static void main(String[] args) {


        String str1 = "Hello";
        String str2 = "Hello";

        // This prints true because both str1 and str2 point to the same
        // string object in the String Pool (Java optimizes string literals
        // by reusing them instead of creating new objects).
        System.out.println(str1 == str2);



        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // This prints false because using 'new String()' forces the creation
        // of a new object in the heap every time. Even if the text is the same,
        // str3 and str4 reference different objects in memory.
        System.out.println(str3 == str4);


    }
}
