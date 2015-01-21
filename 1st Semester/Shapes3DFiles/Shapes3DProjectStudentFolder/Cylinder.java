/**
 * A Cylinder 
 * @author Pranav Mathur
 */

public class Cylinder extends CircularShapeWithHeight {
   
   public Cylinder(double radius, double height) {
      super(radius, height);
   }
   
   public double getVolume() {
      return super.getCrossSectionArea() * super.getHeight();
   }
   
   public double getSurfaceArea() {
      return super.getCrossSectionPerimeter() * super.getHeight();
   }   
   
   public boolean equals(Object obj) {
      if (obj instanceof Cylinder) {
         return this.getHeight() == ((Cylinder)obj).getHeight()
               && this.getRadius() == ((Cylinder)obj).getRadius();
      }
      return false;
   }
   
   public String toString() {
      return "Cylinder with radius of " + super.getRadius() + " and height of " + super.getHeight();
   }
   
}