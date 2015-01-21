/* Answer to Q.1

I am method 1.
I am method 2.
I am method 3
I am method 1
I am method 1
I am method 1
I am method 2
I am method 1
I am method 2
I am method 3
I am method 1
I am method 1
I am method 2
I am method 1

*/


/* Program to draw a figure of astericks and vertical bars.
   @author Pranav Mathur
   09/08/14
*/   

public class MathurLaterns {

   public static void main(String[] args) {
      fig1();
      fig2();
      fig3();
   }
   
   public static void fig1() {
      drawCone();
      System.out.println();
   }  
   
   public static void fig2() {
      drawCone();
      drawBarLine();
      drawLongLine();
      drawCone();
      System.out.println();
   }
   
   public static void fig3() {
      drawCone();
      drawShortLine();
      drawLongLine();
      drawBarLine();
      drawBarLine();
      drawLongLine();
      drawShortLine();
      drawShortLine();
   } 
   
   public static void drawCone() {
      drawShortLine();
      System.out.println("  *********");
      drawLongLine();
   }
   
   public static void drawLongLine() {
      System.out.println("*************");
   }
   
   public static void drawBarLine() {
      System.out.println("* | | | | | *");
   }
   
   public static void drawShortLine() {
      System.out.println("    *****");
   }
   
}   
   