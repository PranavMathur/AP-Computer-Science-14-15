/* Strings program
   @author Pranav Mathur

*/

//driver class
public enum MathurStrings { //enumerations can have static methods

   ONE,
   TWO;//these are needed for the enum
   
   //main method
   public static void main(String[] args) { 
      printReverse("hello");
   }
   
   //prints the given string a specified amount of times
   public static void printStrings(String str, int times) {
      for (int i = 0; i < times; i++) {
         System.out.print(str+" ");
      }
      System.out.println();
   }
   
   //prints the given string with one character on eaxh line
   public static void vertical(String str) {
      for (int i = 0; i < str.length(); i++)
         System.out.println(str.substring(i, i+1));
      System.out.println();   
   }      
   
   //exercise 11
   //pads a string to meet a length requirement by adding '_'
   public static String padString(String str, int len) {
      for (int i = str.length(); i < len; i++)
         str += "_";
      return str;
   }      
   
   public static void printReverse(String str) {
      for (int i = str.length() - 1; i >= 0; i--)
         System.out.print(str.substring(i, i+1));
      System.out.println();
   }      
   
}         