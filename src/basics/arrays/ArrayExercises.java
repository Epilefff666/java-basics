package basics.arrays;

import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {

        int [] myArray = initializeArray();
        System.out.println(Arrays.toString(myArray));

        printArrayElements(myArray);

        int firstElement = getFirstElement(myArray);
        System.out.println(firstElement);

        int[][] myMatrix = initializeMatrix();
        System.out.println(Arrays.deepToString(myMatrix));

        printMatrixElements(myMatrix);
    }

    public static int[] initializeArray() {
        // TODO: Implement this method to return an array with values {1, 2, 3, 4, 5}
        int[] numbers;
        numbers = new int[] {1,2,3,4,5};
        return numbers;
    }

    public static void printArrayElements(int[] array) {
        // TODO: Implement this method to print all elements of the array using System.out.println
        for(int value : array){

            System.out.println(value);
        }

    }
    public static int getFirstElement(int[] array) {
        // TODO: Implement this method to return the first element of the array
        return array[0];
    }

    public static int[][] initializeMatrix() {
        // TODO: Implement this method to return a two-dimensional array with values {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}

        int[][] matrix;
        matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        return matrix;
    }

    public static void printMatrixElements(int[][] matrix) {
        // TODO: Implement the method to print all elements of the two-dimensiona array using System.out.println.

        for(int i = 0 ; i<matrix.length ; i++){

            for(int j = 0; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j]);
            }

            System.out.println();
        }

    }
}
