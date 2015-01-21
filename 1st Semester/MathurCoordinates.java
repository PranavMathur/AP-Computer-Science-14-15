import java.util.*;

public class CoordinatesFactoringFramework {
   public static void main(String[] args) {
   
      // Keeping the following code, rewrite the getCoordinates method below using 
      // factoring to eliminate redundancy.  Your method must still produce the same 
      // output and result under all cases.
   
      Scanner console = new Scanner(System.in);
      double result = getCoordinates(console);
      System.out.println(result);
   
   }

   public static double getCoordinates(Scanner console) {
      System.out.print("What is the x coordinate? ");
      double x = console.nextDouble();
      int negatives;
      if (x < 0.0) {
         System.out.print("What is the y coordinate? ");
         double y = console.nextDouble();
         if (y < 0.0) {
            negatives = 2;
            System.out.println("negatives = " + negatives);
            return x + y + negatives;
         }  
         else {
            negatives = 1;
            System.out.println("negatives = " + negatives);
            return x + y + negatives;
         }
      } 
      else {
         System.out.print("What is the y coordinate? ");
         double y = console.nextDouble();
         if (y < 0.0) {
            negatives = 1;
            System.out.println("negatives = " + negatives);
            return x + y + negatives;
         }  
         else {
            negatives = 0;
            System.out.println("negatives = " + negatives);
            return x + y + negatives;
         }
      }
   }
}
