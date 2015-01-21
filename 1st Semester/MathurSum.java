import java.util.*; //to get Arrays class

/* Adding Large Numbers
   Takes numbers larger than Integer.MAX_VALUE and stores them in arrays of length 25 with one digit per index
   Adds up the arrays
   Outputs the equation with each number intact
   by Pranav Mathur
   AP Computer Science 2014-2015
*/   
   

public class MathurSum { 

   //class constants
   public static final int ARRAY_LENGTH = 25;
   public static final int ZERO = 0; //don't change this
   
   
   //main method
   public static void main(String[] args) {
      String nums[] = { //Strings given in description
          "82384 ", 
          "204 435 ",
          "22 31 12 ",
          "999 483 ", 
          "28350 28345 39823 95689 234856 3482 55328 934803 ",
          "7849323789 22398496 8940 32489 859320 ",
          "729348690234239 542890432323 534322343298 ",
          "3948692348692348693486235 5834938349234856234863423 ",
          "999999999999999999999999 432432 58903 34 ",
          "82934 49802390432 8554389 4789432789 0 48372934287 ",
          "0 ",
          "0 0 0 ",
          "7482343 0 4879023 0 8943242 ",
          "3333333333 4723 3333333333 6642 3333333333 "
      };
      processNums(nums); //run main program
   }
   
   //runs project
   public static void processNums(String[] numStringsArr) {
      for (String i : numStringsArr) { //iterates through strings in array
         String[] nums = parseStringToArray(i, " "); //turns the string of multiple numbers into an array of strings
                                                    //using space as regex
         int[][] numArrays = new int[nums.length][ARRAY_LENGTH]; //creates a 2d array of all the numbers in 
                                                                     //the string stored in arrays
         for (int j = ZERO; j < nums.length; j++) {
            parseStringToInts(nums[j], numArrays[j]); //puts number arrays in the 2d array from the string
         }   
         int[] answerArr = new int[ARRAY_LENGTH]; //creates an array in which the answer will be stored
         addArrays(numArrays, answerArr); //adds arrays in numArrays into answerArr
         System.out.print(arrToString(numArrays[ZERO]));  //prints out equation
         for (int j = 1; j < numArrays.length; j++) {
            System.out.print(" + " + arrToString(numArrays[j]));
         }
         System.out.println(" = " + arrToString(answerArr));
      }
      System.out.print("Total lines = " + numStringsArr.length); //outputs total lines in array
   }
   
   //splits string into array of strings
   public static String[] parseStringToArray(String numStr, String regex) {
      int numTokens = ZERO;
      for (int i = ZERO; i < numStr.length(); i++) { //finds the number of tokens in the string
         if (numStr.substring(i, i+1).equals(regex))
            numTokens++;
      }
      String[] nums = new String[numTokens]; //creates an array which will store the tokens
      int currentIndex = ZERO;
      int currentStart = ZERO;
      int currentArrIndex = ZERO;
      String currentSub = new String();
      while (currentIndex < numStr.length() && currentArrIndex < nums.length) { //puts tokens in array
         String currentChar = numStr.substring(currentIndex, currentIndex+1);
         if (currentChar.equals(regex)) {
            nums[currentArrIndex++] = currentSub;
            currentSub = new String();
            currentStart = currentIndex + 1;
         }
         else {
            currentSub += currentChar;
         }
         currentIndex++;
      }         
            
      return nums; //returns token array
   }
   
   //turns string into 25 length array of ints
   public static void parseStringToInts(String numString, int[] arr) {
      int strLen = numString.length();
      int i = ZERO;
      for (i = ZERO; i < ARRAY_LENGTH-strLen; i++) //fills whitespace spots
         arr[i] = ZERO; 
      int currentStrIndex = ZERO;
      while (i < ARRAY_LENGTH) {
         arr[i] = Character.getNumericValue(numString.charAt(i - (ARRAY_LENGTH - strLen))); //changes character in string to number in array
         i++;
      }   
   }
   
   //takes a 2d array of ints which represent the equation and puts the result in answerArr
   public static void addArrays(int[][] numArrays, int[] answerArr) {
      if (numArrays.length == 1) {
         //returns the first array in numArrays if the length of numArrays is ZERO
         for (int i = ZERO; i < numArrays[ZERO].length; i++) answerArr[i] = numArrays[ZERO][i]; 
      }
      else {
         int carry = ZERO; //represents the extra amount to be added
         for (int currentIndex = ARRAY_LENGTH-1; currentIndex >= ZERO; currentIndex--) { //i didnt want magic numbers so i put ZERO
            int add = ZERO; //represents the sum of the current indices
            for (int[] arr : numArrays)
               add += arr[currentIndex];
            add += carry; //adds the extra amount to add
            carry = add/10; //gets rid of the last digit of carry
            answerArr[currentIndex] = add%10; //sets the value in the array to the ones digit of add
         }     
      }   
   }
   
   //takes an array of numbers and returns a string from those numbers
   public static String arrToString(int[] numArr) {
      String retStr = new String();
      boolean currentZeroes = true; //true while leading ZEROs are being read
      for (int i : numArr) {
         if (i != ZERO) currentZeroes = false; //set to false when non-ZEROs are found
         if (!currentZeroes) retStr += ("" + i); //string is only changed once non-ZEROs are found
      }
      if (currentZeroes) return "0"; //returns 0 if all elements are 0
      return retStr;   
   }   
   
}