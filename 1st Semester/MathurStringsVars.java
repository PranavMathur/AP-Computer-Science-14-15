/* Question 1:

a. 2 + 234
b. 2 2 + 3 4
c. 7 2 + 2
d. (2 + 2) + 7
e. hello 34 8
f. 2(int) 2.042
g. 14.73
h. 123456717

*/

/* Question 2:

Output:
   46
   36
   23
   13

*/

public class MathurStringsVars {

   //Computes the sum of numbers from 1 to n
   public static void main(String[] args) {
   
   int n;
   int answer;
   
   System.out.println("Inputs: 3, 5, 62, 542");
   
   n = 3;
   answer = (n*(n+1))/2;
   System.out.println("The sum from 1 to 3 is: " + answer);
   
   n = 5;
   answer = (n*(n+1))/2;
   System.out.println("The sum from 1 to 5 is: " + answer);
   
   n = 62;
   answer = (n*(n+1))/2;
   System.out.println("The sum from 1 to 62 is: " + answer);
   
   n = 542;
   answer = (n*(n+1))/2;
   System.out.println("The sum from 1 to 542 is: " + answer);


   }
}      
