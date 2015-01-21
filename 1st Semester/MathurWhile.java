import java.util.*;

public class MathurWhile {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      printAverage(console);
      printFactors(72);
      randomX();
      randomWalk();
   }

/* Place your methods' body below. */ 
   public static void printAverage(Scanner console) {	
      double sum = 0;
      int count = 0;
      int current = -1;
      do {
         System.out.print("Type a number: ");
         current = console.nextInt();
         if (current >= 0) {
            sum += (double) current;
            count++;
         }
      } while (current >= 0);
      System.out.println("Average was " + (sum/(double)count));
   }

   public static void printFactors(int n) {
      if (n <= 0) {
         throw new IllegalArgumentException();
      }
      int current = 1;
      do {
         if (n%current == 0) {
            System.out.print(current + " and ");
         }
         current++;
      } while (current <= n/2);
      System.out.print(n);
   }

   public static void randomX() {
   }

   public static void randomWalk(){
   }
}
