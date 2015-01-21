public class MathurIfElseExercisesPart2 { //did i spell it right this time

   public static void main(String... args) {
      System.out.println(fractionSum(5));
      printTriangleType(6, 6, 6);
      System.out.println(getGrade(50));
      System.out.println(swapPairs("example"));
   }
   
   public static double fractionSum(int n) {
      double retVal = 0.00;
      for (int i = n; i > 0; i--)
         retVal += (1./i);
      return retVal;   
   }
   
   public static void printTriangleType(int a, int b, int c) {
      if (a>b+c || b>a+c || c>a+b)
         throw new IllegalArgumentException();
      if (a==b && b==c)
         System.out.println("Equilateral");
      else if (a==b || b==c || c==a)
         System.out.println("Isoscles"); 
      else    
         System.out.print("Scalene");
   }
   
   public static double getGrade(int grade) {
      if (grade < 0 || grade > 100)
         throw new IllegalArgumentException();
      if (grade < 60)
         return 0.00;
      if (grade >= 60 && grade <= 62)
         return 0.7;
      if (grade >= 95)
         return 4.0;
      return .1*(grade-63)+.8;
   }
   
   public static String swapPairs(String str) {
      String after = new String();
      int length = str.length();
      for (int i = 1; i <= length; i += 2) {
         if (i == length) {
            after += str.substring(i - 1, i);
         } else {
            after += str.substring(i, i + 1);
            after += str.substring(i - 1, i);
         }
      }
      return after;         
   }   
   
}   