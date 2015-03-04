// Draws the Sierpinski Carpet fractal image. 
   import java.awt.*; 
   import java.util.*; 
   public class SCarpet { 
      public static final int SIZE = 243; 
      public static void main(String[] args) { 
        // prompt for level 
         Scanner console = new Scanner(System.in); 
         System.out.print("What level do you want? "); 
         int level = console.nextInt(); 
        // initialize drawing panel 
         DrawingPanel p = new DrawingPanel(SIZE, SIZE); 
         Graphics g = p.getGraphics(); 
         drawFigure(g, level, 0, 0, SIZE); 
      } 
    // Draws a Sierpinski carpet to the given level inside the given area. 
      public static void drawFigure(Graphics g, int level, int x, int y, int size) { 
      }
   }