package basics.arrays;

public class IteratingThroughArrays {
    public static void main(String[] args) {

        int[] numbers = new int[] {1,2,3,4,5};

        //using for loop
        System.out.println("using for loop");
        for(int i = 0; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }

        //using foreach loop
        System.out.println("using foreach loop");
        for ( int value : numbers){
            System.out.println(value);
        }


    }
}
