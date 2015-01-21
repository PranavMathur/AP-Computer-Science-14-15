public class ParameterExample {
   public static void main(String[] args) {
      printNumbers(3, 3);
      printNumbers(5, 5);
      printNumbers(7, 7);
   }
   
   public static void printNumbers(int n, int q) {
      for (int i = 1; i <= q; i++)
         System.out.print(n);
      System.out.println();   
   }
   
}      