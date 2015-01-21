import java.util.*; //importing package which contains the Scanner class

//driver class
public class MathurAdmissions {

   //mani method, includes calls to other methods
   public static void main(String[] args) {
   
   }
   
   //prints the introduction as given in the problem description
   public static void printIntroduction() {
      System.out.println("This program compares two applicants to");
      System.out.println("determine which one seems like the stronger");
      System.out.println("applicant. For each candidate I will need");
      System.out.println("either SAT or ACT scores plus a weighted GPA.\n");
   }
   
   /* 
      Instead of using a method to calculate the SAT or ACT final score of a student, I initialized a double called 'examResult' to 0.
      The doubles that are read frmo the console are then added to examResult
   */
   
   //calculates the final score for student one or two
   public static double getInfo(Scanner console, int studentNumber) {
      System.out.println();
      double examResult = 0; //score from SAT/ACT
      double gpaResult = 0; //score from GPA
      if (studentNumber == 1) { //prints one of two lines, depending on which applicant is being scored
         System.out.println("Information for the first applicant:");
      }
      else {   
         System.out.println("Information for the second applicant:");
      }   
      System.out.print("\tdo you have 1) SAT scores or 2) ACT scores? ");
      int testType = console.nextInt(); //reads whether the student took the SAT or ACT
      if (testType == 1) { //to be executed if student took SAT
         System.out.print("\tSAT math? ");
         examResult += console.nextDouble()/24.; 
         System.out.print("\tSAT verbal? ");
         examResult += console.nextDouble()/12.;
      }
      else if (testType == 2) { //to be executed if student took SAT
         System.out.print("\tACT English? ");
         examResult += console.nextDouble()/1.8;
         System.out.print("\tACT math? ");
         examResult += console.nextDouble()/1.8;
         System.out.print("\tACT reading? ");
         examResult += console.nextDouble()/.9;
         System.out.print("\tACT science? ");
         examResult += console.nextDouble()/1.8;
      }
      System.out.print("\toverall GPA? ");
      double overallGPA = console.nextDouble();
      System.out.print("\tmax GPA? ");
      double maxGPA = console.nextDouble();
      gpaResult = 100. * (overallGPA/maxGPA); //calculates GPA score based on overall and max GPA
      return gpaResult + examResult; //returns sum of two scores
   }
   
   public static void printConclusion(double firstApplicantScore, double secondApplicantScore) {
      System.out.println();
      System.out.printf("First applicant overall score = %.2f\n", firstApplicantScore); //prints First applicant info
      System.out.printf("Second applicant overall score = %.2f\n", secondApplicantScore); //prints Second applicant info
      if (compareDouble(firstApplicantScore, secondApplicantScore) > 0) { //prints a conclusion saying the first applicant was higher
         System.out.println("The first applicant seems to be better");
      }
      else if (compareDouble(firstApplicantScore, secondApplicantScore) < 0) { //prints a conclusion saying the second applicant was higher
         System.out.println("The second applicant seems to be better");
      }
      else { //prints a conclusion saying both applicants were equal
         System.out.println("The two applicants seem to be equal");
      }    
   }
   
   public static int compareDouble(double a, double b) { //compares two doubles
      if (Math.abs(a - b) < 0.001) {
         return 0; //returns 0 if both are equal
      }
      else if (a > b) {
         return 1; //returns 1 if the first is higher
      }
      else {
         return -1; //returns -1 if the first is lower
      }
   }            

}