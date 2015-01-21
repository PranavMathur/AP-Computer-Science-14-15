/**
 * A Square Pyramid class that contains variables for base edge length and height
 * @author Pranav Mathur
 */

public class SquarePyramid implements Shape3D {
   
   private double edge;
   private double height;
   
   public SquarePyramid(double edge, double height) {
      this.edge = edge;
      this.height = height;
   }
   
   public double getVolume() {
      return (edge*edge*height)/3;
   }
   
   public double getSurfaceArea() {
      return edge*(edge + Math.sqrt(edge*edge+4*height*height));   
   }         
   
   public double getEdge() {
      return edge;
   }
   
   public double getHeight() {
      return height;
   }
   
   public boolean equals(Object obj) {
      if (obj instanceof SquarePyramid) {
         return this.getEdge() == ((SquarePyramid)obj).getEdge()
            && this.getHeight() == ((SquarePyramid)obj).getHeight();
      }
      return false;      
   }         
   
   public String toString() {
      return "Square Pyramid with base length of " + this.edge + " and height of " + this.height;
   }
     
}