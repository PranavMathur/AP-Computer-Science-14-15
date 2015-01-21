import java.util.*;

public class MathurArrayMethods2 {
   public static void main(String[] args) {
      int[] a1 = new int[] {1, 2, 3, 4, 2, 1, 4, 3, 54, -3};
      int[] a2 = new int[] {4, 2, 1};
      System.out.println("Min of a1: " + findMin(a1));
      System.out.println("Count of 1 in a1: " + count(a1, 1));
      System.out.println("Stretch of a1: " + Arrays.toString(stretch(a1)));
      System.out.println("a1 contains a2: " + contains(a1, a2));
   }
   
   public static int findMin(int[] arr) {
      int low = arr[0];
      for (int i : arr) {
         if (low > i)
            low = i;
      }
      return low;
   }
   
   public static int count(int[] arr, int n) {
      int count = 0;
      for (int i : arr) {
         if (i == n) 
            count++;
      }             
      return count;
   }
   
   public static int[] stretch(int[] arr) {
      int[] stretchArr = new int[arr.length*2];
      for (int i = 0; i < arr.length; i++) {
         if (arr[i]%2 == 0) {
            stretchArr[i*2] = arr[i]/2;
            stretchArr[i*2 + 1] = arr[i]/2;
         }   
         if (arr[i]%2 != 0) {
            stretchArr[i*2] = arr[i]/2;
            stretchArr[i*2 + 1] = arr[i]/2+1;
         } 
      }
      return stretchArr;
   }      
   
   public static boolean contains(int[] a1, int[] a2) {
      for (int i = 0; i < a1.length-a2.length; i++) {
         boolean c = true;
         for (int j = i; j < a2.length; j++) {
            if (a1[j] != a2[j])
               c = false;
         }
         if (c)
            return c;
      }
      return false;
   }               
}   