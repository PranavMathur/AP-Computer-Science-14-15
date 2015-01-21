/* For Loops Practice
   24 September 2014
   @author Pranav Mathur
*/   

//Question 1:

/* 

1 3 5 7 9

1 * 3 * 11 * 

1 3 1 2 1 1
2 3 2 2 2 1
3 3 3 2 3 1

4 0 4 3
5 0 5 3

1 3 0 1 3 1
1 2 0 1 2 1
1 1 0 1 1 1

2 3 0 2 3 1
2 2 0 2 2 1
2 1 0 2 1 1

*/

//Question 2:

/*
     "i":                 "j":             Output:
     
      1                    1                " "
      
      1                    2                " "
      
      1                    3                " "
      
      1                    1                 * 
      
      2                    1                " "
      
      2                    2                " "
      
      2                    1                 *
      
      2                    2                 *
      
      2                    3                 *
      
      3                    1                " "    
      
      3                    1                 *
      
      3                    2                " "
      
      3                    3                 *
      
      3                    4                 *
      
      3                    5                " "  
*/

//Question 3:

/*

1. System.out.println(15*i - 11);
2. System.out.println(40 - 10*i);
3. System.out.println(4*i - 11);
4. System.out.println(100 - 3*i);

*/

//driver class
public class MathurForLoopsPractice {

   //main method
   public static void main(String[] args) {
      problem4();
      System.out.println();
      problem5();
      System.out.println();
      problem6();
      System.out.println();
      problem7();
      System.out.println();
      problem8A();
      System.out.println();
      problem8B();
      
   }   
   
   //uses a for loop to compute the sum of the integers from 1 to 6 inclusive
   public static void problem4() {
      int sum = 0;
      for (int i = 1; i <= 6; i++)
         sum += i;
      System.out.println(sum);
   }      
   
   //calculates the amount of the Java textbook Sarah has read after 20 months
   public static void problem5() {
      double currentKnowledge = 0.00;
      double unknownKnowledge = 100.00;
      final double PERCENT_NEEDED = 95.00;
      for (int currentMonth = 0; currentMonth < 100; currentMonth++) {
         currentKnowledge += 0.1 * unknownKnowledge;
         unknownKnowledge = 100.00 - currentKnowledge;
      }
      System.out.println("She knew " + currentKnowledge + "% after 20 months!");
   }         
   
   //calculates and prints the first 12 Fibonacci numbers
   public static void problem6() {
      int first = 1;
      int second = 1;
      int temp = 0;
      for (int i = 0; i < 12; i++) {
         System.out.println(first);
         temp = first;
         first = second;
         second += temp;
      }      
   }      
   
   //prints a 5x3 row of astericks
   public static void problem7() {
      for (int row = 0; row < 3; row++) {
         for (int column = 0; column < 5; column++) 
            System.out.print("*");
         System.out.println();
      }      
   }   
   
   //prints the first option in problem 8
   public static void problem8A() {
      for (int num = 1; num <= 7; num++) {
         for (int i = 0; i < num; i++) 
            System.out.print(num);
         System.out.println();
      }
   }   
   
   //prints the second option in problem 
   public static void problem8B() {      
      for (int num = 1; num <= 9; num += 2) {
         for (int i = 0; i < (11 - num)/2; i++)
            System.out.print("-");
         for (int i = 0; i < num; i++)
            System.out.print(num);   
         for (int i = 0; i < (11 - num)/2; i++)
            System.out.print("-");
         System.out.println();   
      }
   }                        
      
}   