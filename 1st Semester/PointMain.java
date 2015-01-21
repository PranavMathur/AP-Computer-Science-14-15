public class PointMain {

   public static void main(String[] args) {
      Point p = new Point(1, 2);
      System.out.println(p.modifiedToString());
      Point q = new Point(p);
      q.translate(1, 1);
      System.out.println(p.isVertical(q));
      System.out.println(q.slope(p));
   }
   
}   