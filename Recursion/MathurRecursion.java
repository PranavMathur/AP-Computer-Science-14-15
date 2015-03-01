public class MathurRecursion {
   
   public static void main(String[] args) {
      writeSquares(1);
      System.out.println();
      writeSquares(5);
      System.out.println();
      writeSquares(8);
      
   }
   
   public static int multiplyEvens(int i) {
      if (i <= 0) throw new IllegalArgumentException();
      if (i == 1) return 2;
      return 2 * i * multiplyEvens(i-1);
   }   
   
   public static void writeSquares(int i) {
      if (i < 1) throw new IllegalArgumentException();
      if (i == 1) {
         System.out.print(1);
         return;
      }
      if (i%2 == 1)
         System.out.print(i*i + ", ");
      writeSquares(i-1);
      if (i%2 == 0)
         System.out.print(", " + i*i);
   }  
    
}