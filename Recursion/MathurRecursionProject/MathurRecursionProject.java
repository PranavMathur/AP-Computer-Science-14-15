public class MathurRecursionProject {

   public static void main(String[] args) {
      //Problem 3
      /*for (int i = 1; i <= 10; i++) {
         writeSequence(i);
         System.out.println();
      } */
      
      //Problem 4
      /*System.out.println(doubleDigits(348));  
      System.out.println(doubleDigits(-789));  */
      
      //Problem 7
      /*for (int i = 1; i <= 8; i++) {
         writeChars(i);
         System.out.println();
      }   */
      
      //Problem 9
      /*System.out.println(sumTo(0));
      System.out.println(sumTo(2));*/
      
      //Problem 11
      /*System.out.println(isReverse("hello", "oLLeH"));*/
      
      //Problem 12
      /*System.out.println(indexOf("Barack Obama", "bam"));*/
      
      //Problem 13
      /*System.out.println(evenDigits(8342116));
      System.out.println(evenDigits(35159));
      System.out.println(evenDigits(-34512));*/
      
      //Problem 14
      System.out.println(permut(6, 3));
      System.out.println(permut(7, 4));
   }
   
   //Problem 3
   public static void writeSequence(int num) {
      if (num <= 0) throw new IllegalArgumentException();
      else if (num == 1) {
         System.out.print("1 ");
      }
      else if (num == 2) {
         System.out.print("1 1 ");
      }
      else {
         if (num%2 == 0)
            System.out.print(num/2 + " ");
         else
            System.out.print(num/2 + 1 + " ");
         writeSequence(num-2);
         if (num%2 == 0)
            System.out.print(num/2 + " ");
         else
            System.out.print(num/2 + 1 + " ");
      }
   }   
   
   //Problem 4
   public static int doubleDigits(int n) {
      if (n == 0) 
         return 0;
      else if (n < 0) 
         return doubleDigits(-n) * -1;
      return doubleDigits(n/10) * 100 + 11*(n%10);
   }      
   
   
   //Problem 7
   public static void writeChars(int n) {
      if (n <= 0) throw new IllegalArgumentException();
      else if (n == 1) System.out.print("*");
      else if (n == 2) System.out.print("**");
      else {
         System.out.print("<");
         writeChars(n-2);
         System.out.print(">");  
      }   
   }   
   
   //Problem 9
   public static double sumTo(int n) {
      if (n < 0) throw new IllegalArgumentException();
      else if (n == 0) 
         return 0.0;
      double d = (double) n;
      return (1/d) + sumTo(n-1);
   }   
   
   //Problem 11
   public static boolean isReverse(String one, String two) {
      return reverse(one.toLowerCase()).equals(two.toLowerCase());
   }

   private static String reverse(String str) {
      if (str == null || str.length() <= 1)
         return str;
      return reverse(str.substring(1)) + str.charAt(0);
   }
   
   //Problem 12
   public static int indexOf(String one, String two) {
      if (one.length() < two.length())
         return -1;
      if (one.substring(0, two.length()).equals(two))
         return 0;
      int next = indexOf(one.substring(1), two);
      return next == -1 ? -1 : 1 + next;
   }
   
   //Problem 13
   public static int evenDigits(int n) {
      if (n == 0)
         return 0;
      if ((n % 10) % 2 == 0)
         return evenDigits((n - n%10)/10) * 10 + n%10;
      return evenDigits((n - n%10)/10);
   }
   
   //Problem 14
   public static int permut(int n, int r) {
      if (r == 0) return 1;
      
      return permut(n - 1, r - 1) * n;
   }

}