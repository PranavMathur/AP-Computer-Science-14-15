import java.util.*;

public class Mathur2DArrays {
   public static void main(String[] args) {
      //Problem 1
      int[][] matrix1 = {{3, 1, 4, 1, 5, 9, 2, 6}, 
         {5, 3, 5, 8, 9, 7, 9, 3},
            {2, 3, 8, 4, 6, 2, 6, 4},
               {3, 3, 8, 3, 2, 7, 9, 5}, 
                  {0, 2, 8, 8, 4, 1, 9, 7},
                     {1, 6, 9, 3, 9, 9, 3, 7}};
      System.out.println(Arrays.deepToString(matrix1));
      for (int[] row : matrix1)
         row[4] = row[1];
      System.out.println(Arrays.deepToString(matrix1));
      
      //Problem 2
      int[][] grid = new int[4][6];
      for (int i = 0, num = 2; i < 6; i++, num += 3)
         grid[1][i] = num;
      System.out.println(Arrays.deepToString(grid));      
      for (int[] row : grid) {
         System.out.print("[");
         for (int col : row) {
            System.out.print(col + "\t");
         }
         System.out.println("]");
      }      
      
      //Problem 4
      double[][] exp = new double[10][4];
      for (int row = 0; row < 10; row++) {
         for (int col = 0; col < 4; col++) {
            exp[row][col] = Math.pow(row+1, col+1);
         }
      }
      for (double[] row : exp) {
         System.out.print("[");
         for (double col : row) {
            System.out.print(col + "\t");
         }
         System.out.println("]");
      }
      
      //Problem 5
      String[][] board = {{"X", "O", "O"}, {" ", "X", " "}, {" ", " ", "O"}};
      for (String[] row : board) {
         System.out.println("-------------");
         for (String element : row) {
            System.out.print("| " + element + " ");
         }
         System.out.println("|");
      }
      System.out.println("-------------");   
            
   }   
   
   //Problem 3
   public static int[][] matrixAdd(int[][] a, int[][] b) {
      int[][] c = new int[a.length][a[0].length];
      for (int row = 0; row < a.length; row++) {
         for (int column = 0; column < a[0].length; column++) {
            c[row][column] = a[row][column]+b[row][column];
         }
      }
      return c;      
   }   
   
}   