package basics.strings;

public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "john";
        String lastName = "Doe";
        String fullName = firstName+ " "+lastName;
        System.out.println(fullName);

        // the operator + is used for concatenate int and double values too

        //StringBuilder class

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("world");
        System.out.println(stringBuilder.toString()); // we call toString method for convert the StringBuild to a String and print it

        //StringBuffer class
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("world");
        System.out.println(stringBuffer.toString());

        // the stringbuilder and stringBuffer classes are mutable and these are a powerful alternatives to the plus operator for string concatenation
    }
}
