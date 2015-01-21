public class Point {

   //fields for position
   private int x;
   private int y;
   
   //Empty constructor, sets point at origin
   public Point() {
      this(0, 0);
   }   
   
   //sets point at same location as other point
   public Point(Point other) {
      this(other.x, other.y);
   }   
   
   //sets point at given location, x > 0 and y > 0
   public Point(int x, int y) throws IllegalArgumentException{
      if (x < 0 || y < 0)
         throw new IllegalArgumentException();
      this.x = x;
      this.y = y;
   }   
   
   //returns x coordinate of point
   public int getX() {
      return this.x;
   }
   
   //returns y coordinate of point
   public int getY() {
      return this.y;
   }      
   
   //sets x coordinate of point
   public void setX(int x1) {
      if (x1 < 0) throw new IllegalArgumentException();
      this.x = x1;
   }
   
   //sets y coordinate of point
   public void setY(int y1) {   
      if (y1 < 0) throw new IllegalArgumentException();
      this.y = y1;
   }   
   
   //moves point by a certain amount
   public void translate(int dx, int dy) {
      if (x + dx < 0 || y + dy < 0) 
         throw new IllegalArgumentException();
      this.x += dx;
      this.y += dy;
   }   
   
   public double distanceFromOrigin() {
      return Math.sqrt(this.x*this.x + this.y*this.y);
   }   
   
   @Override
   public String toString() {
      return "(" + this.x + ", " + this.y + ")";
   }   
   
   public String modifiedToString() {
      return "java.awt.Point[x=" + this.x + ", y=" + this.y + "]";
   }   
   
   public boolean isVertical(Point other) {
      return this.x == other.x;
   }
   
   public int manhattanDistance(Point other) {
      return Math.abs(this.x - other.x) +Math.abs(this.y - other.y);
   }
   
   public double slope(Point other) {
      if (isVertical(other)) throw new IllegalArgumentException();
      return ((double)this.y - (double)(other.y))/((double)this.x - (double)(other.x));
   }   
   
}   