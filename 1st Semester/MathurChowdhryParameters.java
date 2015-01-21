public class MathurChowdhryParameters extends abstractTest implements interfaceTest{
   public static void main(String[] args) {
      MathurChowdhryParameters test = new MathurChowdhryParameters();
      test.printNumbers(3);
      test.printSquare(3, 7);
      test.printGrid(4, 6);
      double value = 12.;
      System.out.println("The square root of " + value + " is " + Math.sqrt(value));
   }
   
   public void printNumbers(int max) {
      for (int i = 1; i <= max; i++)
         System.out.print("[" + i + "]");
      System.out.println();
   }
   
   public void printSquare(int min, int max) {
      for (int row = min; row <= max; row++) {
         for (int i = row; i <= max; i++) 
            System.out.print(i);
         for (int i = min; i < row; i++)
            System.out.print(i);
         System.out.println();    
      }
   }
   
   public void printGrid(int rows, int columns) {
      int current = 1;
      for (int i = 1; i <= rows; i++) {
         for (current = i; current <= (rows * columns); current += rows)
            System.out.print(current + " ");
         System.out.println();
      }
   }         
   
}

class Point {
   static int points = 0;
   int x;
   int y;
   
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
      Point.points++;
   }
   
} 

interface interfaceTest {
   void printNumbers(int max);
   void printSquare(int min, int max);
}   

abstract class abstractTest {
   abstract void printGrid(int rows, int columns);
   
   public double slope(Point a, Point b) {
      double dx = (double)(b.x - a.x);
      double dy = (double)(b.y - a.y);
      return dy/dx;
   }
}   