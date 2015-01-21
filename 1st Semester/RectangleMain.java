public class RectangleMain {

   public static void main(String[] args) {
      Rectangle r1 = new Rectangle(-5, 5, 8, 7);
      Rectangle r2 = new Rectangle(-1, -1, 5, 5);
      System.out.print(r1.intersect(r2));
   }
   
}    