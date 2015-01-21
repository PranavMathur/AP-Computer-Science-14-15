import java.util.*;

/* 1.
   2 [0, 1]
   1 [0, 1]
   1 [1, 2]
   0 [1, 2]

*/

public class MathurMoreArrays {
   public static void main(String[] args) {
     
   }  
   
   //Problem 2
   public static boolean isPalindrome(String[] args) {
      for (int i = 0, j = args.length - 1; i <= j; i++, j--) {
         if (!args[i].equals(args[j])) {
            return false;
         }
      }
      return true;
   }
   
   //Problem 3
   public static boolean isSorted(double[] a) {
      for (int i = 0; i < a.length-1; i++)
         if (a[i] > a[i+1])
            return false;
      return true;
   }   
   
   //Problem 4
   public static boolean isUnique(int[] a) {
      for (int i = 0; i < a.length-1; i++) {
         for (int j = i+1; j < a.length; j++) {
            if (a[i]==a[j]) {
               return false;
            }
         }
      }
      return true;
   }         
   
   //Problem 5
      
   public static int sum(int[] a) {
      int s = 0; 
      for (int i : a)
         s += i;
      return s;
   }             
   
   
}