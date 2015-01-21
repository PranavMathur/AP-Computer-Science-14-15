import java.util.*;

public class MathurABCD {
   
   public static void main(String[] args) {
      ArrayList<String> letterList = new ArrayList<>();
      letterList.add("A"); letterList.add("B"); letterList.add("C"); letterList.add("D");
      
      //problem 1
      for (int i = 0; i < letterList.size() - 1; i += 2)
         letterList.add(i+1, "plus");
      System.out.println(letterList);
      
      //Problem 2
      for (int i = 1; i < letterList.size(); i++)
         letterList.remove(i);
      System.out.println(letterList);
      
      //Problem 3
      for (int i = letterList.size() - 1; i > 0; i--)
         letterList.add(i, "plus");
      System.out.println(letterList);  
      
      //Problem 4
      for (int i = letterList.size() - 1; i > 0; i -= 2)
         letterList.remove(i-1);
      System.out.println(letterList);    
      
   }
   
}