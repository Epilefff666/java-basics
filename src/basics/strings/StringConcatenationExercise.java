package basics.strings;

public class StringConcatenationExercise {

    public static void main(String[] args) {
        String concatenatedString = concatenateStrings("Hello","World");
        System.out.println(concatenatedString);

    }

    public static String concatenateStrings(String part1, String part2) {
        /*
            TODO:
            Implement the concatenateStrings method
            For example, if part1 = "Hello" and part2 = "World", the returned value of the 'concatenateStrings' method should be "Hello World"
            Note: there is a space between the two parts
        */

        StringBuilder sentence = new StringBuilder();

        sentence.append(part1);
        sentence.append(" ");
        sentence.append(part2);

        return sentence.toString();
    }
}
