import java.util.*;

/* 

1. Assertions with method mystery

            next == 0   prev == 0   next == prev      
Point A         
Point B
Point C
Point D
Point E

2. Assertions with method pow

            y > 0       y % 2 == 0
Point A
Point B
Point C
Point D
Point E
Point F
Point G

*/

public class MathurBoolean {
   public static void main(String[] args) {
   
      assert 1 == 456;
      
      if (consecutive(8, 6, 7)) {
         System.out.println("Numbers 8, 6, 7 are consecutive.");
      } 
      else {
         System.out.println("Numbers 8, 6, 7 are not consecutive.");
      }
      if (consecutive(8, 10, 7)) {
         System.out.println("Numbers 8, 10, 7 are consecutive.");
      }
      else {
         System.out.println("Numbers 8, 10, 7 not are consecutive.");
      }
      if (monthApart(4, 15, 5, 22)) {
         System.out.println("4, 15, 5, 22 are at least a month apart.");
      }
      else {
         System.out.println("4, 15, 5, 22 are not at least a month apart.");
      }
      if (monthApart(9, 19, 10, 17)) {
         System.out.println("9, 19, 10, 17 are at least a month apart.");
      }
      else {
         System.out.println("9, 19, 10, 17 are not at least a month apart.");
      }
   
   }

/* Place your method body below. */ 

   public static boolean consecutive(int a, int b, int c) {
      return true;
   }

   public static boolean monthApart(int m1, int d1, int m2, int d2) {
      return true;
   }

}
