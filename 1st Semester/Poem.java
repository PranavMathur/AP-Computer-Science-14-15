public abstract class Poem {
   public abstract int numLines();
   public abstract int getSyllables(int lineNum);
   public void printRhythm() {
      for (int line = 1; line <= this.numLines(); line++) {
         System.out.print("ta");
         for (int i = 1; i < getSyllables(line); i++) {
            System.out.print("-ta");
         }
         System.out.println();
      }
   }            
}