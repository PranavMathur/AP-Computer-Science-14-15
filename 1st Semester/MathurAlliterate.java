public class MathurAlliterate
{
   public static void main(String[] args)
   {
      System.out.print(System.getProperty("java.version"));
   }

// Returns true if s1 and s2 end with the same two letters.
   public static boolean rhyme(String s1, String s2) 
   {
      return s1.length() >= 2 && s2.length() >= 2 && s1.endsWith(s2.substring(s2.length() - 2));
   }

   public static boolean alliterate(String s1, String s2) {
      return s1.substring(0, 1).equals(s2.substring(0, 1));
   }   

}  