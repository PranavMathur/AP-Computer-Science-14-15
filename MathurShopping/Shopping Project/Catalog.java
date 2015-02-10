import java.util.*;

public class Catalog {

   private List<Item> list;
   private String name;
   
   public Catalog(String name) {
      this.name = name;
      list = new ArrayList<Item>();
   }   
   
   public void add(Item item) {
      list.add(item);
   }
   
   public int size() {
      return list.size();
   }
   
   public Item get(int index) {
      return list.get(index);
   }
   
   public String getName() {
      return name;
   }   
   
   public String toString() {
      String retStr = "";
      retStr += this.name;
      for (Item i : list)
         retStr += "\n" + i.toString();
      return retStr;
   }           
      
}