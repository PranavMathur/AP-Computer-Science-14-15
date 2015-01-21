public class Rectangle {
   private int x;
   private int y;
   private int height;
   private int width;
   
   //constructs a Rectangle using the given coordinates, height, and width
   public Rectangle(int x, int y, int height, int width) {
      this.x = x;
      this.y = y;
      this.height = height;
      this.width = width;
   }
   
   public Rectangle(Point p, int height, int width) {
      this(p.getX(), p.getY(), height, width);
   }   
   
   public int getHeight() {
      return this.height;
   }
   
   public int getWidth() {
      return this.width;
   }
   
   public int getX() {
      return this.x;
   }
   
   public int getY() {
      return this.y;
   }
   
   public void setHeight(int h) {
      this.height = h;
   }
   
   public void setWidth(int w) {
      this.width = w;
   }
   
   public void setX(int x) {
      this.x = x;
   }
   
   public void setY(int y) {
      this.y = y;
   }
   
   public boolean contains(int x, int y) {
      return this.x < x && x < this.x + this.width 
            && this.y > y && y > this.y - this.height;
   }
   
   public boolean contains(Point p) {
      return this.contains(p.getX(), p.getY());
   }
   
   public Rectangle union(Rectangle rect) {
      int newX = Math.min(this.x, rect.x);
      int newY = Math.max(this.y, rect.y);
      int newWidth = Math.max(this.x + this.width, rect.x + rect.width) - newX;
      int newHeight = newY - Math.min(this.y - this.height, rect.y - rect.height);
      return new Rectangle(newX, newY, newHeight, newWidth);
   }   
   
   public Rectangle intersect(Rectangle rect) {
      return null;
   }
   
   public String toString() {
      return "Rectangle[x=" + this.x + ", y=" + this.y + ", height=" + this.height +
            ", width=" + this.width + "]";
   }   
   
}   