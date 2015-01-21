import java.util.*;

public class MathurIfElseEquals {
   public static void main(String[] args) {
   
   // Complete equals exercise #13 OR #15 from the text on page 299.
   
   // equals exercise #13 printPalindrome
   // Write a method called printPalindrome that accepts a Scanner for the
   // console as a parameter, and prompts the user to enter one or more words
   // and prints whether the entered String is a palindrome (i.e. reads the
   // same forwards as it does backwards, like "abba" or "racecar").
   // For an added challenge, make the code case-insensitive, so that words
   // like "Abba" and "Madam" will be considered palindromes.
   // NOTE: Use substring method and NOT charAt
   /*	Scanner console13 = new Scanner(System.in);
      	printPalindrome(console13);
   */
   
   // equals exercise #15 wordCount
   // Write a method called wordCount that accepts a String as its parameter and
   // returns the number of words in the String. A word is a sequence of one or
   // more nonspace characters (any character other than ' '). For example,
   // the call wordCount("hello") should return 1, the call wordCount("how are you?")
   // whould return 3, the call wordCount(" this string has wide spaces ") 
   // should return 5, and the call wordCount(" ") should return 0.
   /*
   String phrase = "how are you?";
   int numberOfWords = wordCount(phrase);
   System.out.println("The number of words in \"" + phrase + "\" is " + numberOfWords);
   phrase = " this  string  has  wide  spaces ";
   numberOfWords = wordCount(phrase);
   System.out.println("The number of words in \"" + phrase + "\" is " + numberOfWords);
   phrase = " ";
   numberOfWords = wordCount(phrase);
   System.out.println("The number of words in \"" + phrase + "\" is " + numberOfWords);
   */
   
   Scanner console = new Scanner(System.in);
   System.out.println("Enter the name of your city");
   String city = console.next();
   if (city == "Vancouver")
      System.out.print("Vancouver");
   }
     
// equals exercise #13 printPalindrome

// equals exercise #15 wordCount

}
