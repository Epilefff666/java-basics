package basics.arrays;

import java.util.Arrays;

public class TwoDimentionalArrays {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matrix: "+ Arrays.deepToString(matrix));

        //position or index of a matrix works like:  matrix [row index value] [column index value]
        System.out.println("Element at row = 1 column = 2: "+ matrix[1][2]);

        //change value of row 1 column 2

        matrix[1][2] = 15;
        System.out.println("Matrix: "+ Arrays.deepToString(matrix));
        System.out.println("Element at row = 1 column = 2 changed: "+ matrix[1][2]);
    }
}
