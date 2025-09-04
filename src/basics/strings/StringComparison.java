package basics.strings;

public class StringComparison {
    public static void main(String[] args) {


        // equal is used for compare the contents of a string object
        String str1 = "hello";
        String str2 = "hello";
        if(str1.equals(str2)){
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Both strings are not equal");
        }


        //the next comparison ignores the case-sensitive into the strings
        String str3 = "Hello";
        String str4 = "hello";
        if(str3.equalsIgnoreCase(str4)){
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Both strings are not equal");
        }

        //using the == operator it verifies if both strings have the same object reference but not de contents

        if(str1 == str2){
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Both strings are not equal");
        }

        //using compareTo is used for compare two string in lexicographic order
        String str5 = "hello";
        String str6 = "hello";
        if(str5.compareTo(str6) == 0){
            System.out.println("the strings are equal");
        } else if ( str5.compareTo(str6)> 0) {
            System.out.println("The first string is greater than the second");
        }else{
            System.out.println("The first string is less than the second");
        }
    }
}
