package basics.arrays;
import java.util.Arrays;

    //initializing arrays
public class CreateArray {
    public static void main(String[] args) {
        int [] integers = new int[5];
        System.out.println("integers: " + Arrays.toString(integers));

        double [] doubles = new double[2];
        System.out.println("doubles: "+Arrays.toString(doubles));

        boolean [] booleans = new boolean[3];
        System.out.println("booleans: "+Arrays.toString(booleans));

        String [] strings = new String[4];
        System.out.println("strings: "+Arrays.toString(strings));

        //initialized with values
        int [] numbers = new int[] {1,2,3,4,5};
        System.out.println("arrays numbers:"+ Arrays.toString(numbers));

        System.out.println("The first element is: "+ numbers[0]);

        //modify an element in arrays

        numbers[0] = 6;
        System.out.println("arrays numbers modified:"+ Arrays.toString(numbers));
        System.out.println("The new first element is: "+ numbers[0]);
    }
}
