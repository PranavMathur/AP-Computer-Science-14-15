/**
 * A Circular Cone class that contains variables base radius and height
 * @author Pranav Mathur
 */

public class CircularCone extends CircularShapeWithHeight {

   public CircularCone(double radius, double height) {
      super(radius, height);      
   }
   
   public double getVolume() {
      return super.getCrossSectionArea() * super.getHeight() * (1./3.);
   }   
   
   public double getSurfaceArea() {
      return Math.PI * super.getRadius() * Math.sqrt(super.getRadius()*super.getRadius() + 
            super.getHeight() * super.getHeight()) + super.getCrossSectionArea();  
   }   
   
   public boolean equals(Object obj) {
      if (obj instanceof CircularCone) {
         return this.getHeight() == ((CircularCone)obj).getHeight()
               && this.getRadius() == ((CircularCone)obj).getRadius();
      }
      return false;
   }      
   
   public String toString() {
      return "Circular Cone with radius of " + super.getRadius() + " and height of " + super.getHeight();
   }   
   
}