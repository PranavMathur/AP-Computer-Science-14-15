public class Limerick extends Poem {
   public int numLines() {
      return 5;
   } 
   
   public int getSyllables(int lineNum) {
      if (lineNum == 3 || lineNum == 4) {
         return 6;
      }
      return 9;   
   }   
}