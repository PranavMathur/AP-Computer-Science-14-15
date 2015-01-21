public class LineMain {
   
   public static void main(String[] args) {
      Line a = new Line(new Point(1, 2), new Point(3, 4));
      System.out.println(a);
      Line b = new Line(5, 2, 3, 4);
      System.out.println(b);
      System.out.println(b.getSlope());
   }

}