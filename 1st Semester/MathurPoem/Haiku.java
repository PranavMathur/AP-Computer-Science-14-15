public class Haiku extends Poem {
   public int numLines() {
      return 3;
   }   
   
   public int getSyllables(int lineNum) {
      if (lineNum == 2)
         return 7;
      return 5;
   }      
}