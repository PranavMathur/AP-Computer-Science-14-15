/* Prints a rocket ship design as stated in the assignment
   Includes a class constant to change size
   @author Pranav Mathur
*/
   
//driver class
public class MathurRocketShip {

   //class constant to change size
   public static final int SIZE = 0;
   
   //main method to call other methods
   public static void main(String[] args) { 
      printTriangle();
      printEqualsLine();
      printDownTriangles();
      printUpTriangles();
      printEqualsLine();
      printUpTriangles();
      printDownTriangles();
      printEqualsLine();
      printTriangle();
   }
   
   //prints triangles used in top and bottom of ship
   public static void printTriangle() {
      for (int width = 1; width < 2 * SIZE; width++) {
         for (int i = 0; i < 2 * SIZE - width; i++)
            System.out.print(" ");
         for (int i = 0; i < width; i++)
            System.out.print("/");
         System.out.print("**");
         for (int i = 0; i < width; i++)
            System.out.print("\\");   
         System.out.println();   
      }
   }
   
   //prints half of large squares   
   public static void printDownTriangles() {
      for (int row = 1; row <= SIZE; row++) {
         System.out.print("|");
         for (int i = 0; i < row - 1; i++) 
            System.out.print(".");
         for (int i = 0; i < -1 * row + (SIZE + 1); i++) 
            System.out.print("\\/");   
         for (int i = 0; i < 2 * (row - 1); i++) 
            System.out.print(".");   
         for (int i = 0; i < -1 * row + (SIZE + 1); i++) 
            System.out.print("\\/");   
         for (int i = 0; i < row - 1; i++) 
            System.out.print(".");   
         System.out.println("|");   
      }
   }
   
   //prints other half of large quares
   public static void printUpTriangles() {
      for (int row = SIZE; row >= 1; row--) {
         System.out.print("|");
         for (int i = 0; i < row - 1; i++) 
            System.out.print(".");
         for (int i = 0; i < -1 * row + (SIZE + 1); i++) 
            System.out.print("/\\");   
         for (int i = 0; i < 2 * (row - 1); i++) 
            System.out.print(".");   
         for (int i = 0; i < -1 * row + (SIZE + 1); i++) 
            System.out.print("/\\");   
         for (int i = 0; i < row - 1; i++) 
            System.out.print(".");   
         System.out.println("|");   
      }
   }
   
   //prints lines created by '='
   public static void printEqualsLine() {
      System.out.print("+");
      for (int i = 0; i < 2 * SIZE; i++)
         System.out.print("=*");
      System.out.print("+");
      System.out.println();   
   }     

}