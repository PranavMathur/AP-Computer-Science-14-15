import java.util.*;

/* Question 1:
   a. 0
   b. 9
   c. 8
   d. 2
   e. 6
*/

/* Question 2:
   a. 0
   b. 1
   c. 2
   d. 2
   e. 3
*/

public class MathurArrayPr {
   public static void main(String[] args) {
   	// 1. Write a method swap that accepts an array of integers 
   	// and two indexes and swaps the elements at those indexes.
      int[] a1 = {12, 34, 56};
      swap(a1, 1, 2);
      System.out.println(Arrays.toString(a1));  // [12, 56, 34]
   
   	// 2.	Write a method swapAll that accepts two arrays of integers 
   	// as parameters and swaps their entire contents.
   	// Assume that the two arrays are the same length.
      int[] a1b = {12, 34, 56};
      int[] a2b = {20, 50, 80};
      swapAll(a1b, a2b);
      System.out.println(Arrays.toString(a1b));  // [20, 50, 80]
      System.out.println(Arrays.toString(a2b));  // [12, 34, 56]
   
   	// 3.	Write a method merge that accepts two arrays of integers 
   	// and returns a new array containing all elements of the first array 
   	// followed by all elements of the second.
      int[] a1c = {12, 34, 56};
      int[] a2c = {7, 8, 9, 10};
      int[] a3c = merge(a1c, a2c);
      System.out.println(Arrays.toString(a3c));
   	// [12, 34, 56, 7, 8, 9, 10]
   
   	// 4.	Write a method merge3 that merges 3 arrays similarly to problem 3.
      int[] a1d = {12, 34, 56};
      int[] a2d = {7, 8, 9, 10};
      int[] a3d = {444, 222, -1};
      int[] a4d = merge3(a1d, a2d, a3d);
      System.out.println(Arrays.toString(a4d));
   	// [12, 34, 56, 7, 8, 9, 10, 444, 222, -1]
      int[] a4e = merge3(a1d, a2d, a3d);
      System.out.println(Arrays.toString(a4e));
   	
   	// 5. Determines the percent of even numbers in an array of integers.
      int[] numbers = {6, 2, 9, 11, 3};
      double percent = percentEven(numbers);
      System.out.println("The percent of even numbers in " 
         + Arrays.toString(numbers) + " is " + percent + ".");
   }
   
   public static void swap(int[] arr, int i1, int i2) {
      int temp = arr[i1];
      arr[i1] = arr[i2];
      arr[i2] = temp;
   }
   
   public static void swapAll(int[] arr1, int[] arr2) {
      int temp = 0;
      int length = arr1.length;
      for (int i = 0; i < length; i++) {
         temp = arr1[i];
         arr1[i] = arr2[i];
         arr2[i] = temp;
      }   
   }
   
   public static int[] merge(int[] a, int[] b) {
      int[] newArr = new int[a.length + b.length];
      int currentIndex = 0;
      for (currentIndex = 0; currentIndex < a.length; currentIndex++) {
         newArr[currentIndex] = a[currentIndex];
      }
      for (currentIndex = a.length; currentIndex < b.length+a.length; currentIndex++) {
         newArr[currentIndex] = b[currentIndex-a.length];
      }
      return newArr;
   }   
   
   public static int[] merge3(int[] a, int[] b, int[] c) {
      return merge(a, merge(b, c));
   }
   
   public static double percentEven(int[] arr) {
      if (arr.length != 0)
         return 0;
      int evens = 0;
      for (int i : arr) {
         if (i%2 == 0) {
            evens++;
         }
      }
      return ((double)evens * 100.0)/((double)arr.length);
   }      

}