/* This program prints a pattern of three figures made with astericks
   @author Pranav Mathur
   09/08/14
*/
public class MathurAstericks {
   
   // Prints three figures, each separated by a blank line
   public static void main(String[] args) {
      fig1();
      fig2();
      fig3();
   }
   
   // Prints the first figure needed 
   public static void fig1() {
      printRectangle();
      print5();
      System.out.println();
   }
   
   // Prints the second figure needed
   public static void fig2() {
      printRectangle();
      print5();
      printRectangle();
      System.out.println();
   }
   
   // Prints the third figure needed
   public static void fig3() {
      for (int i = 0; i < 3; i++) System.out.println("    *");
      fig1();
   }
   
   public static void printRectangle() {
      System.out.println("* * * * *");
      System.out.println("* * * * *");
   }
   
   public static void print5() {
      System.out.println("   * *");
      System.out.println("    *");
      System.out.println("   * *");
   }
   
}
   
   
      