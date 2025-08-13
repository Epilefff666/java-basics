package basics.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int  y = 10;

        System.out.println( x > 0 && y > 0); // AND operator &&
        System.out.println( x > 10 || y > 15); // OR operator ||
        System.out.println( !(x < 0) ); // NOT operator !


    }
}
