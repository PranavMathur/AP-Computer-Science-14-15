import java.util.*;

public class ShoppingCart {
   
   private ArrayList<ItemOrder> list;
   private boolean discount;
   
   public ShoppingCart() {
      list = new ArrayList<ItemOrder>();
      discount = false;
   }
   
   public void add(ItemOrder order) {
      for (int i = 0; i < list.size(); i++) {
         if (order.getItem().toString().equals(list.get(i).getItem().toString())) {
            list.set(i, order);
            return;
         }
      }
      list.add(order);
   }
   
   public void setDiscount(boolean discount) {
      this.discount = discount;
   }   
   
   public double getTotal() {
      double total = 0.;
      for (ItemOrder i : list)
         total += i.getPrice();
      if (discount)
         total *= .9;   
      return total;
   }
   
   public String toString() {
      String retStr = "";
      for (ItemOrder i : list)
         retStr += i.toString() + "\n";
      if (discount)
         retStr += "Qualifies for discount";
      else 
         retStr += "Does not qualify for discount";
      return retStr;
   }         
   
}