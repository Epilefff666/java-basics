package basics.arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] numbers = new int[] {1,2,3,4,5};

        //using length method about arrays
        System.out.println("The length of the array is :"+ numbers.length);

        //using the sort method
        int[] numbers2 = new int[] {5,2,1,4,3};
        Arrays.sort(numbers2);
        System.out.println("The sorted arrays is: "+ Arrays.toString(numbers2));

        //binary search method
        int searchKey = 23;
        int index = Arrays.binarySearch(numbers,searchKey);

        if(index >= 0){
            System.out.println("The element "+ searchKey + " is found at index " + index );
        }else{
            System.out.println("The element "+ searchKey + " is not found at index " + index );
        }

    }
}
