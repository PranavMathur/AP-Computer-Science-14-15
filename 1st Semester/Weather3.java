import java.util.*;

public class Weather3 {
   
   public static void main(String[] args) {
      System.out.print("How many temperatures do you want to input? ");
      Scanner console = new Scanner(System.in);
      int[] temperatures = new int[console.nextInt()];
      int sum = 0;
      for (int i = 0; i < temperatures.length; i++) {
         System.out.print("Temperature? ");
         int temp = console.nextInt();
         temperatures[i] = temp;
         sum += temp;
      }
      System.out.print(temperatures.toString());
   }
}      
         