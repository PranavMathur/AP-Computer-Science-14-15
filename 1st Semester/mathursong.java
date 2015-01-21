/* AP Computer Science Project #1: Song
   This program uses flow of control to print the verses of a song
   @author Pranav Mathur
   09/09/14 
*/


//Driver class
public class mathursong {
   
   //Main method that calls all verses
   public static void main(String[] args) {
      printFlyVerse();
      printSpiderVerse();
      printBirdVerse();
      printCatVerse();
      printDogVerse();
      printHorseVerse();
   }
   
   //Prints fly verse and calls swallow fly method
   public static void printFlyVerse() {
      System.out.println("There was an old woman who swallowed a fly.");
      swallowFly();
   }
   
   //Prints spider verse and calls swallow spider method
   public static void printSpiderVerse() {
      System.out.println("There was an old woman who swallowed a spider.");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      swallowSpider();
   }
   
   //Prints bird verse and calls swallow bird method
   public static void printBirdVerse() {
      System.out.println("There was an old woman who swallowed a bird.");
      System.out.println("How absurd to swallow a bird.");
      swallowBird();
   }
   
   //Prints cat verse and calls swallow  cat method
   public static void printCatVerse() {
      System.out.println("There was an old woman who swallowed a cat.");
      System.out.println("Imagine that to swallow a cat.");
      swallowCat();
   }
   
   //Prints dog verse and calls swallow dog method
   public static void printDogVerse() {
      System.out.println("There was an old woman who swallowed a dog.");
      System.out.println("What a hog to swallow a dog.");
      swallowDog();
   }
   
   //Prints horse verse
   public static void printHorseVerse() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course."); 
   }
   
   //Prints repeated swallow fly lines
   public static void swallowFly() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println();
   } 
   
   //Prints repeated swallow spider lines and calls swallow fly method
   public static void swallowSpider() {
      System.out.println("She swallowed the spider to catch the fly,");
      swallowFly();
   }
   
   //Prints repeated swallow bird lines and calls swallow spider method
   public static void swallowBird() {
      System.out.println("She swallowed the bird to catch the spider,");
      swallowSpider();
   }
   
   //Prints repeated swallow cat lines and calls swallow bird method
   public static void swallowCat() {
      System.out.println("She swallowed the cat to catch the bird,");
      swallowBird();
   }
   
   //Prints swallow dog lines and calls swallow cat method
   public static void swallowDog() {
      System.out.println("She swallowed the dog to catch the cat,");
      swallowCat();
   }   
      
}      