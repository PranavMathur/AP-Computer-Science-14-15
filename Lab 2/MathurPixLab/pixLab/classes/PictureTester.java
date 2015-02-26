/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
   /** Method to test zeroBlue */
   public static void testZeroBlue()
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.zeroBlue();
      beach.explore();
   }
   
   /** Method to test mirrorVertical */
   public static void testMirrorVertical()
   {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorVertical();
      caterpillar.explore();
   }
   
   /** Method to test mirrorTemple */
   public static void testMirrorTemple()
   {
      Picture temple = new Picture("temple.jpg");
      temple.explore();
      temple.mirrorTemple();
      temple.explore();
   }
   
   /** Method to test the collage method */
   public static void testCollage()
   {
      Picture canvas = new Picture("640x480.jpg");
      canvas.createCollage();
      canvas.explore();
   }
   
   /** Method to test edgeDetection */
   public static void testEdgeDetection()
   {
      Picture swan = new Picture("swan.jpg");
      swan.edgeDetection(10);
      swan.explore();
   }
   
   public static void testKeepOnlyBlue() {
      Picture swan = new Picture("swan.jpg");
      swan.keepOnlyBlue();
      swan.explore();
   }   
   
   public static void testNegate() {
      Picture temple = new Picture("temple.jpg");
      temple.negate();
      temple.explore();
   }   
   
   public static void testGrayscale() {
      Picture swan = new Picture("swan.jpg");
      swan.grayscale();
      swan.explore();
   }  
   
   public static void testFixUnderwater() {
      Picture swan = new Picture("water.jpg");
      swan.fixUnderwater();
      swan.explore();
   }   
   
   public static void testMirrorRightLeft() {
      Picture temple = new Picture("caterpillar.jpg");
      temple.mirrorVerticalRightToLeft();
      temple.explore();
   }   
   
   public static void testMirrorHorizontal() {
      Picture temple = new Picture("redMotorcycle.jpg");
      temple.mirrorHorizontal();
      temple.explore();
   }   
   
   public static void testMirrorHorizontalBotToTop() {
      Picture temple = new Picture("redMotorcycle.jpg");
      temple.mirrorHorizontalBotToTop();
      temple.explore();
   }
   
   public static void testMirrorDiagonal() {
      Picture temple = new Picture("beach.jpg");
      temple.mirrorDiagonal();
      temple.explore();
   }  
   
   public static void testMirrorArms() {
      Picture temple = new Picture("snowman.jpg");
      temple.explore();
      temple.mirrorArms();
      temple.explore();
   }   
   
   public static void testMirrorSeagull() {
      Picture temple = new Picture("seagull.jpg");
      temple.explore();
      temple.mirrorSeagull();
      temple.explore();
   }   
   
   public static void testCopy() {
      Picture a = new Picture("640x480.jpg");
      Picture b = new Picture("flower1.jpg");
      a.copy(b, 0, 0, 0, 0, 50, 50);
      a.explore();
   }   
   
   public static void testMyCollage() {
      Picture a = new Picture("640x480.jpg");
      a.myCollage();
      a.explore();
   }   
   
   /** Main method for testing.  Every class can have a main
     * method in Java */
   public static void main(String[] args)
   {
      // uncomment a call here to run a test
      // and comment out the ones you don't want
      // to run
      //testKeepOnlyBlue();
      //testKeepOnlyRed();
      //testKeepOnlyGreen();
      //testNegate();
      //testGrayscale();
      //testFixUnderwater();
      //testMirrorVertical();
      //testMirrorSeagull();
      //testMirrorGull();
      //testMirrorDiagonal();
      //testCollage();
      //testCopy();
      testMyCollage();
      //testEdgeDetection();
      //testEdgeDetection2();
      //testChromakey();
      //testEncodeAndDecode();
      //testGetCountRedOverValue(250);
      //testSetRedToHalfValueInTopHalf();
      //testClearBlueOverValue(200);
      //testGetAverageForColumn(0);
   }
}