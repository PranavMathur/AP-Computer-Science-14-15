/**
 * A Cube class that contains a variable for edge length
 * @author Pranav Mathur
 */

public class Cube extends RectangularPrism {
   
   public Cube(double edge) {
      super(edge, edge, edge);
   }   
   
   public double getEdgeLength() {
      return super.getLength();
   }   
   
   public String toString() {
      return "Cube with length, width, and height of " + super.getLength();
   }
   
   public boolean equals(Object obj) {
      if (obj instanceof Cube) {
         return super.getLength() == ((Cube)obj).getLength();
      }
      else if (obj instanceof RectangularPrism) {
         return super.getLength() == ((RectangularPrism)obj).getLength()
               && super.getLength() == ((RectangularPrism)obj).getWidth()
                     && super.getLength() == ((RectangularPrism)obj).getHeight();
      }
      return false;   
   }
      
}