import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
   ///////////////////// constructors //////////////////////////////////
   
   /**
    * Constructor that takes no arguments 
    */
   public Picture ()
   {
      /* not needed but use it to show students the implicit call to super()
       * child constructors always call a parent constructor 
       */
       
      super();  
   }
   
   /**
    * Constructor that takes a file name and creates the picture 
    * @param fileName the name of the file to create the picture from
    */
   public Picture(String fileName)
   {
      // let the parent class handle this fileName
      super(fileName);
   }
   
   /**
    * Constructor that takes the width and height
    * @param height the height of the desired picture
    * @param width the width of the desired picture
    */
   public Picture(int height, int width)
   {
      // let the parent class handle this width and height
      super(width,height);
   }
   
   /**
    * Constructor that takes a picture and creates a 
    * copy of that picture
    * @param copyPicture the picture to copy
    */
   public Picture(Picture copyPicture)
   {
      // let the parent class do the copy
      super(copyPicture);
   }
   
   /**
    * Constructor that takes a buffered image
    * @param image the buffered image to use
    */
   public Picture(BufferedImage image)
   {
      super(image);
   }
   
   ////////////////////// methods ///////////////////////////////////////
   
   /**
    * Method to return a string with information about this picture.
    * @return a string with information about the picture such as fileName,
    * height and width.
    */
   public String toString()
   {
      String output = "Picture, filename " + getFileName() + 
         " height " + getHeight() 
         + " width " + getWidth();
      return output;
      
   }
   
   /** Method to set the blue to 0 */
   public void zeroBlue()
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setBlue(0);
         }
      }
   }
   
   public void keepOnlyBlue() {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setRed(0);
            pixelObj.setGreen(0);
         }
      }
   }   
   
   public void negate() {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setRed(255 - pixelObj.getRed());
            pixelObj.setGreen(255 - pixelObj.getGreen());
            pixelObj.setBlue(255 - pixelObj.getBlue());
         }
      }
   } 
   
   public void grayscale() {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            int avg = (pixelObj.getBlue()+pixelObj.getRed()+pixelObj.getGreen())/3;
            pixelObj.setRed(avg);
            pixelObj.setGreen(avg);
            pixelObj.setBlue(avg);
         }
      }
   } 
   
   public void fixUnderwater() {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setRed(pixelObj.getRed()*6);
            //pixelObj.setGreen(0);
            //pixelObj.setBlue(0);
         }
      }
   }
   
   /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
   public void mirrorVertical()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int width = pixels[0].length;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; col < width / 2; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][width - 1 - col];
            rightPixel.setColor(leftPixel.getColor());
         }
      } 
   }
   
   public void mirrorVerticalRightToLeft()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int width = pixels[0].length;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = pixels[row].length-1; col >= width/2; col--)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][width - 1 - col];
            rightPixel.setColor(leftPixel.getColor());
         }
      } 
   }
   
   public void mirrorHorizontal()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int col = 0; col < pixels[0].length; col++)
      {
         for (int row = 0; row < height/2; row++)
         {
            topPixel = pixels[row][col];
            bottomPixel = pixels[height - 1 - row][col];
            bottomPixel.setColor(topPixel.getColor());
         }
      } 
   }
   
   public void mirrorHorizontalBotToTop()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int col = 0; col < pixels[0].length; col++)
      {
         for (int row = height - 1; row > height/2; row--)
         {
            topPixel = pixels[row][col];
            bottomPixel = pixels[height - 1 - row][col];
            bottomPixel.setColor(topPixel.getColor());
         }
      } 
   }
   
   public void mirrorDiagonal() {
      Pixel[][] pixels = this.getPixels2D();
      Pixel originalPixel = null;
      Pixel newPixel = null;
      int height = pixels.length;
      for (int row = 0; row < height; row++) {
         for (int col = 0; col <= row; col++) {
            originalPixel = pixels[row][col];
            newPixel = pixels[col][row];
            newPixel.setColor(originalPixel.getColor());
         }
      }
   }  
   
   /** Mirror just part of a picture of a temple */
   public void mirrorTemple()
   {
      int mirrorPoint = 276;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int count = 0;
      Pixel[][] pixels = this.getPixels2D();
      
      // loop through the rows
      for (int row = 27; row < 97; row++)
      {
         // loop from 13 to just before the mirror point
         for (int col = 13; col < mirrorPoint; col++)
         {
            
            leftPixel = pixels[row][col];      
            rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
            rightPixel.setColor(leftPixel.getColor());
            count++;
         }
      }
      System.out.println(count);
   }
   
   public void mirrorArms() {
      int mirrorPoint = 193;
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int col = 98; col < 175; col++)
      {
         for (int row = 156; row < 192; row++)
         {
            topPixel = pixels[row][col];
            bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
            bottomPixel.setColor(topPixel.getColor());
         }
      } 
      
      for (int col = 223; col < 302; col++)
      {
         for (int row = 167; row < 220; row++)
         {
            topPixel = pixels[row][col];
            bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
            bottomPixel.setColor(topPixel.getColor());
         }
      } 
   }
   
   public void mirrorSeagull() {
      int mirrorPoint = 360;
      Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      for (int col = 237; col < 354; col++)
      {
         for (int row = 230; row < 333; row++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
            rightPixel.setColor(leftPixel.getColor());
         }
      }
   }
   
   /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
   public void copy(Picture fromPic, 
                  int startRow, int startCol)
   {
      Pixel fromPixel = null;
      Pixel toPixel = null;
      Pixel[][] toPixels = this.getPixels2D();
      Pixel[][] fromPixels = fromPic.getPixels2D();
      for (int fromRow = 0, toRow = startRow; 
            fromRow < fromPixels.length &&
            toRow < toPixels.length; 
            fromRow++, toRow++)
      {
         for (int fromCol = 0, toCol = startCol; 
               fromCol < fromPixels[0].length &&
               toCol < toPixels[0].length;  
               fromCol++, toCol++)
         {
            fromPixel = fromPixels[fromRow][fromCol];
            toPixel = toPixels[toRow][toCol];
            toPixel.setColor(fromPixel.getColor());
         }
      }   
   }
   
   public void copy(Picture fromPic, 
                  int startRow, int startCol, int fromStartRow, int fromStartCol, int fromEndRow, int fromEndCol)
   {
      Pixel fromPixel = null;
      Pixel toPixel = null;
      Pixel[][] toPixels = this.getPixels2D();
      Pixel[][] fromPixels = fromPic.getPixels2D();
      for (int fromRow = fromStartRow, toRow = startRow; 
            fromRow < fromEndRow &&
            toRow < toPixels.length; 
            fromRow++, toRow++)
      {
         for (int fromCol = fromStartCol, toCol = startCol; 
               fromCol < fromEndCol &&
               toCol < toPixels[0].length;  
               fromCol++, toCol++)
         {
            fromPixel = fromPixels[fromRow][fromCol];
            toPixel = toPixels[toRow][toCol];
            toPixel.setColor(fromPixel.getColor());
         }
      }   
   }

   /** Method to create a collage of several pictures */
   public void createCollage()
   {
      Picture flower1 = new Picture("flower1.jpg");
      Picture flower2 = new Picture("flower2.jpg");
      this.copy(flower1,0,0);
      this.copy(flower2,100,0);
      this.copy(flower1,200,0);
      Picture flowerNoBlue = new Picture(flower2);
      flowerNoBlue.zeroBlue();
      this.copy(flowerNoBlue,300,0);
      this.copy(flower1,400,0);
      this.copy(flower2,500,0);
      this.mirrorVertical();
      this.write("collage.jpg");
   }
   
   public void myCollage() {
      Picture a = new Picture("caterpillar.jpg");
      copy(a, 0, 0);
      Picture aNegated = new Picture(a);
      aNegated.negate();
      copy(aNegated, 200, 0);
      Picture aMirrored = new Picture(a);
      aMirrored.mirrorDiagonal();
      copy(aMirrored, 400, 0);
      mirrorVertical();
      write("myCollage.jpg");
   }   
   
   
   /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
  public void edgeDetection(int edgeDist)
   {
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      Color rightColor = null;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; 
               col < pixels[0].length-1; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][col+1];
            rightColor = rightPixel.getColor();
            if (leftPixel.colorDistance(rightColor) > 
                 edgeDist)
               leftPixel.setColor(Color.BLACK);
            else
               leftPixel.setColor(Color.WHITE);
         }
      }
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      Color bottomColor = null;
      for (int row = 0; row < pixels.length-1; row++)
      {
         for (int col = 0; 
               col < pixels[0].length; col++)
         {
            topPixel = pixels[row][col];
            bottomPixel = pixels[row+1][col];
            bottomColor = bottomPixel.getColor();
            if (topPixel.colorDistance(bottomColor) > 
                 edgeDist)
               topPixel.setColor(Color.BLACK);
            else
               topPixel.setColor(Color.WHITE);
         }
      }
   }
   
   
   /* Main method for testing - each class in Java can have a main 
    * method 
    */
   public static void main(String[] args) 
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.zeroBlue();
      beach.explore();
        
   }
   
} // this } is the end of class Picture, put all new methods before this
