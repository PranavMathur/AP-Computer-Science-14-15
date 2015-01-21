import java.util.*;

public class MathurBills {
   public static void main(String[] args) {
      mystery1(new ArrayList<Integer>(new int[] {2, 6, 1, 8}));
   }
   
   public static int getBills(Scanner console) {
      double amount = console.nextDouble();
      System.out.println();
      int numBills = (int) (amount / 20.0);
      if (numBills * 20.0 < amount) {
         numBills++;
      }
      return numBills;
   }   
   
   public static void mystery1(ArrayList<Integer> list) { 
    for (int i = list.size() - 1; i > 0; i--) { 
        if (list.get(i) < list.get(i - 1)) { 
            int element = list.get(i); 
            list.remove(i); 
            list.add(0, element); 
        } 
    } 
    System.out.println(list); 
} 

}
