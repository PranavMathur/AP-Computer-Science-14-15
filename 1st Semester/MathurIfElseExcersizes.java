import java.util.*;

public class MathurIfElseExcersizes {
   
   public static void main(String[] args) {
      smallestLargest(new Scanner(System.in));
      evenSumMax(new Scanner(System.in));
   }
   
   public static void smallestLargest(Scanner console) {
      System.out.print("How many numbers do you want to enter? ");
      int reps = console.nextInt();
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < reps; i++) {
         System.out.print("Number " + (i+1) + ": ");
         int num = console.nextInt();
         if (num > max) {
            max = num;
         }
         if (num < min) {
            min = num;
         }   
      }
      System.out.println("Smallest = " + min);
      System.out.println("Largest = " + max);   
   }
   
   public static void evenSumMax(Scanner console) {
      System.out.print("How many integers? ");
      int reps = console.nextInt();
      int max = Integer.MIN_VALUE;
      int sum = 0;
      for (int i = 0; i < reps; i++) {
         System.out.print("Next integer? ");
         int num = console.nextInt();
         if (num%2 == 0) {
            if (num > max)
               max = num;
            sum += num;
         }
      }
      System.out.print("Even sum = " + sum + ", even max = " + max);         
   }   
   
}   