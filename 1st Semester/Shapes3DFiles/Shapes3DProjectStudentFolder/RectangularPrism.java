/**
 * A Rectangular Prism class that contains variables for length, width, and height
 * @author Pranav Mathur
 */

public class RectangularPrism implements Shape3D {
   private double length;
   private double height;
   private double width;
   
   public RectangularPrism(double length, double width, double height) {
      this.length = length;
      this.height = height;
      this.width = width;
   }
   
   public double getLength() {
      return this.length;
   }   
   
   public double getHeight() {
      return this.height;
   }
   
   public double getWidth() {
      return this.width;
   }
   
   public double getVolume() {
      return this.length*this.width*this.height;
   }
   
   public double getSurfaceArea() {
      return 2 * (length*width+width*height+height*length);   
   }      
   
   public boolean equals(Object obj) {
      if (obj instanceof RectangularPrism) {
         return this.getLength() == ((RectangularPrism)obj).getLength() &&
            this.getWidth() == ((RectangularPrism)obj).getWidth() &&
               this.getHeight() == ((RectangularPrism)obj).getHeight();
      }  
      return false;          
   }
   
   public String toString() {
      return "Rectangular Prism with a length of " + this.length + ", width of " + 
            this.width + ", and a height of " + this.height;
   }   
   
}