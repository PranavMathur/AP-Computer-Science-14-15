/**
 * A Sphere class that contains variables for radius length
 * @author Pranav Mathur
 */

public class Sphere implements Shape3D {
   
   private double radius;
   
   public Sphere(double radius) {
      this.radius = radius;
   }
   
   public double getVolume() {
      return (4./3.) * Math.PI * radius * radius * radius;
   }   
   
   public double getSurfaceArea() {
      return 4. * Math.PI * radius * radius;
   }   
   
   public double getRadius() {
      return radius;
   }   
   
   public boolean equals(Object obj) {
      if (obj instanceof Sphere) {
         return this.getRadius() == ((Sphere)obj).getRadius();
      }
      return false;
   }      
   
   public String toString() {
      return "Sphere with a radius " + radius;
   }
   
}