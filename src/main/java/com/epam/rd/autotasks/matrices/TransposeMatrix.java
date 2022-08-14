package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        int[][] temp = new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++)  {
                temp[col][row] = matrix[row][col];
            }
        }

        //System.out.println("" + matrix.length + "  " + matrix[0].length + "  ");
        /*
        for (int row[] : temp) {
            for (int col : row) {
                System.out.printf("%3d ", col);
            }
            System.out.println("");
        }*/
        return temp;
    }

    public static void main(String[] args) {

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
