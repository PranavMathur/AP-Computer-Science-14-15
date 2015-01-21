public class Line {

   //fields for position
   private Point endP1;
   private Point endP2;
   
   //constructs a line using the two given points
   public Line(Point p1, Point p2) {
      this.endP1 = p1;
      this.endP2 = p2;
   }
   
   //constructs a line using the four given coordinates
   public Line(int x1, int y1, int x2, int y2) {
      this(new Point(x1, y1), new Point(x2, y2));
   }   
   
   //returns the first endpoint of the line
   public Point getP1() {
      return endP1;
   }
   
   //returns the second endpoint of the line
   public Point getP2() {
      return endP2;
   }         
   
   //returns a textual representation of the line
   public String toString() {
      return "[" + endP1 + ", " + endP2 + "]";
   }   
   
   //returns the slope of the line
   public double getSlope() {
      return endP1.slope(endP2);
   }   
   
   

}