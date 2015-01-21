import java.util.*;

public class MathurArrayListExamples {
   
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      System.out.println(list);
      list.add("Soccer");
      list.add("Curling");
      list.add("Cross Country");
      list.add("Bob Sledding");
      System.out.println(list);
      
      String sport = list.get(1);
      System.out.println(sport);
      
      list.remove(0);
      list.remove(1);
      System.out.println(list);
      
      list.add("Soccer");
      list.add("Cross Country");
      
      System.out.println(list);
      
      list.set(0, "Baseball");
      System.out.println(list);
      
      for (String sportz : list) {
         System.out.println(sportz);
      }   
      
      if (list.contains("Baseball")) {
         System.out.println(list.indexOf("Baseball"));
      }   
      
      list.add("Croquet");
      list.add("Swimming");
      for (int i = 0; i < list.size(); i++)
         if (list.get(i).startsWith("B")) {
            list.remove(i); 
            i--;
         }   
            
      System.out.println(list);      
      
      ArrayList<Double> doubleList = new ArrayList<>();
      doubleList.add(20.5);
      doubleList.add(423.3242);
      doubleList.add(1, 234.234);
      System.out.println(doubleList); 
      
      ArrayList<String> a = f("asdf");
      System.out.println(a);
   }
   
   public static <E> ArrayList<E> f(E e) {
      ArrayList<E> list = new ArrayList<E>();
      for (int i = 0; i < 10; i++) list.add(e);
      return list;
   }   
   
}