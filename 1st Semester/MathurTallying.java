import java.util.*;

public class MathurTallying {
   public static void main(String[] args) {
      int[] arr = {1,	-2,	4,	-4,	9,	-6,	16,	-8,	25,	-10};
      int[] arr2 = {3, 5, 6, 7, 8, 8, 7, 6, 6, 6, 2, 2, 2, 3};
      System.out.println(Arrays.toString(arr));
      System.out.println("Mode: " + mode(arr2));
      System.out.println("Last Index of 4: " + lastIndexOf(arr, 4));
      System.out.println("Range: " + range(arr));
      System.out.println("Standard Deviation: " + stdDev(arr));
   }
   
   //Problem 1
   public static int mode(int[] arr) {
      int[] tallies = new int[100];
      for (int i : arr) 
         tallies[i]++;
      int highest = arr[0];
      for (int i = 99; i >= 0; i--) {
         if (tallies[i] > highest)
            highest = i;
      }
      return highest;
   }       
   
   //Problem 3
   public static int lastIndexOf(int[] arr, int val) {
      int i = -1;
      for (int j = 0; j < arr.length; j++) {
         if (arr[j] == val)
            i = j;
      }
      return i;
   }
   
   //Problem 4
   public static int range(int[] arr) {
      int h = arr[0];
      int l = arr[0];
      for (int i : arr) {
         if (i > h)
            h = i;
         if (i < l)
            l = i;
      }
      return (h - l)+1;
   }         
   
   //Problem 5
   public static double stdDev(int[] arr) {
      double sum = 0;
      for (int i : arr)
         sum += (double)i;
      double mean = sum/((double)arr.length);
      double sumSquare = 0;
      for (int i : arr)
         sumSquare += (i - mean)*(i - mean);
      return (Math.sqrt(sumSquare)/(arr.length-1));   
   }
            
}        