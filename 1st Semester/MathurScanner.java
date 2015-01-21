import java.util.*;

public class MathurScanner {

  
      /*Scanner c1 = new Scanner(System.in);
      inputBirthday(c1);
      Scanner c2 = new Scanner(System.in);
      processString(c2);
      System.out.println("Pranav Mathur".indexOf(" "));*/
      public static void main(String[] args)
    {
        // Each method displays a message and returns a Boolean value.  
        // Method1 returns false and Method2 returns true. When & is used, 
        // both methods are called. 
        System.out.println("Regular AND:");
        if (Method1() & Method2())
            System.out.println("Both methods returned true.");
        else
            System.out.println("At least one of the methods returned false.");

        // When && is used, after Method1 returns false, Method2 is  
        // not called.
        System.out.println("\nShort-circuit AND:");
        if (Method1() && Method2())
            System.out.println("Both methods returned true.");
        else
            System.out.println("At least one of the methods returned false.");
    }

    public static boolean Method1()
    {
        System.out.println("Method1 called.");
        return false;
    }

    public static boolean Method2()
    {
        System.out.println("Method2 called.");
        return true;
    }
   
   
   public static void inputBirthday(Scanner console) {
      System.out.println("On what day of the month were you born? ");
      int day = console.nextInt();
      System.out.println("What is the name of the month in which you were born? ");
      String month = console.next();
      System.out.println("During which year were you born? ");
      int year = console.nextInt();
      System.out.println ("You were born on " + month + " " + day + ", " + year + ". You're mighty old!");  
   }   
   
   public static void processString(Scanner console) {
      System.out.println("Please enter your full name: ");
      String first = console.next();
      String last = console.next();
      System.out.println("Your name in reverse order is " + last + ", " + first);
   }   
      
   
}   