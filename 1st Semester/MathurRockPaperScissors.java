import java.util.*; //include java.util for the Scanner Class

/* Rock, Paper Scissors
   by Pranav Mathur
   November 2014
*/

//driver class
public class MathurRockPaperScissors {

   //main method which calls other methods
   public static void main(String[] args) {
      giveIntro();
      int games = promptNumGames(new Scanner(System.in));
      runMatch(games, new Scanner(System.in));
   }   
   
   //outputs the intro given in the problem description
   public static void giveIntro() {
      System.out.println("This program plays games of Rock-Paper-Scissors");
      System.out.println("against the computer. You'll type in your guess");
      System.out.println("of (R)ock, (P)aper, or (S)cissors and try to");
      System.out.println("beat the computer as many times as you can.");
      System.out.println();
   }   
   
   //asks the user how many games they want per match
   public static int promptNumGames(Scanner console) {
      int num = 0;
      do {
         System.out.print("Best out of how many games (must be odd)? ");
         num = console.nextInt();
         if (num%2 != 1 || num <= 0) {
            //prints a message if the inputted number is invalid
            System.out.println("Invalid number of games. Type a positive odd number!");
         }
      } while (num%2 != 1 || num < 0);
      return num;      
            
   }
   
   //asks the user if they want another match
   public static boolean promptRematch(Scanner console) {
      System.out.print("Do you want to play again? ");
      return console.next().substring(0, 1).equalsIgnoreCase("y");
   }
   
   //keeps track of statistics from all matches
   //runs single games and records result of game
   public static void runMatch(int games, Scanner console) {
      int numGames = 0;
      int numWins = 0;
      int numTies = 0;
      int gameResult = 0;
      boolean playAgain = true;
      while (playAgain) {
         for (int i = 1; i <= games; i++) {
            gameResult = runGame(i, console);
            numGames++;
            if (gameResult == 0) {
               numTies++;   
            }
            else if (gameResult == 1) {
               numWins++;
            }   
         }
         playAgain = promptRematch(console);
         System.out.println();
      }
      System.out.println();
      printResults(numGames, numWins, numTies);
   }  
   
   //runs a game in the console and returns 1 if the user won, 2 if the computer won, and 0 if a tie occured.
   public static int runGame(int gameNum, Scanner console) {
      System.out.println("Game " + gameNum + ": ");
      int randComputerWeapon = (int)(Math.random()*3);
      String computerWeapon = new String();
      
      //finds the CPU weapon using a random number
      if (randComputerWeapon == 0) {
         computerWeapon = "R";
      }   
      else if (randComputerWeapon == 1) {
         computerWeapon = "P";
      } 
      else {
         computerWeapon = "S";
      }   
      
      //takes the user weapon from the console
      int userWeapon = -1;
      System.out.print("Choose your weapon? ");
      String userInput = console.next();
      
      if (userInput.substring(0, 1).equalsIgnoreCase("r")) {
         userWeapon = 0;
      }   
      else if (userInput.substring(0, 1).equalsIgnoreCase("p")) {
         userWeapon = 1;
      }  
      else {
         userWeapon = 2;
      }
      
      System.out.println("I chose the weapon: " + computerWeapon);
      int result = gameResult(userWeapon, randComputerWeapon);
      
      if (result == 1) {
         System.out.println("You win!");
      }
      else if (result == 2) {
         System.out.println("You lose!");
      }
      else {
         System.out.println("Tie!");
      }
      
      return result;         
   }
   
   //returns 1 if the user won, 2 if the computer won, and 0 if a tie occured.
   public static int gameResult(int user, int computer) {
      //Rock = 0, Paper = 1, Scissors = 2
      if (user == 0) {
         if (computer == 0) {
            return 0;
         }
         else if (computer == 1) {
            return 2;
         }
         return 1; //computer == 2
      }
      else if (user == 1) {
         if (computer == 0) {
            return 1;
         }
         else if (computer == 1) {
            return 0;
         }
         return 2; //computer == 2
      } 
      else { //user == 2
         if (computer == 0) {
            return 2;
         }
         else if (computer == 1) {
            return 1;
         }
         return 0; //computer == 2
      }
   }                     
   
   //takes the number of games, wins, and ties
   //prints the number of games, wins, losses, ties, and win percentage
   public static void printResults(int games, int wins, int ties) {
      System.out.println("Overall results:");
      System.out.println("total games = " + games);
      System.out.println("wins        = " + wins);
      System.out.println("losses      = " + (games - (wins + ties)));
      System.out.println("ties        = " + ties);
      double winPercent = ((double)wins/(double)games);
      System.out.println("win %        = " + (winPercent*100));
   }   

}