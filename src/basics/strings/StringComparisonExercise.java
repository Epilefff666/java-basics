package basics.strings;

public class StringComparisonExercise {
    public static void main(String[] args) {
        boolean res = compareStrings("Hello","hello",true);
        System.out.println(res);
    }
    public static boolean compareStrings(String str1, String str2, boolean ignoreCase) {

        if(ignoreCase){
            return str1.equalsIgnoreCase(str2);
        }else{
            return str1.equals(str2);
        }

    }
}
