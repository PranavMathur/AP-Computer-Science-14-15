import java.util.*;

public class MathurMidPoint {
   public static void main(String[] args) {
   hasMidpoint(8, 8, 9);
      if (hasMidpoint(7, 4, 10)) {
         System.out.println("7, 4, 10 has a midpoint.");
      }
      else {
         System.out.println("7, 4, 10 does not have a midpoint.");
      }
      if (hasMidpoint(9, 15, 8)) {
         System.out.println("9, 15, 8 has a midpoint.");
      }
      else {
         System.out.println("9, 15, 8 does not have a midpoint.");
      }
   
   }

/* Place your method body below. */ 

   public static boolean hasMidpoint(int a, int b, int c) {
      return Math.abs((double)a-((double)b+c)/2) < 0.001 || 
            Math.abs((double)b-((double)a+c)/2) < 0.001 || 
                  Math.abs((double)c-((double)a+b)/2) < 0.001;
   }
   
   

}
