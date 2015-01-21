/* A grocery item that contains a name, quantity, and cost
   by Pranav Mathur
   12 December 2014
*/

public class GroceryItemOrder {
   
   //fields
   private String name;
   private int quantity;
   private double costPerItem;
   
   //constructor to set fields to given values
   public GroceryItemOrder(String n, int q, double c) {
      this.name = n;
      this.quantity = q;
      this.costPerItem = c;
   }
   
   //returns cost times quantity, total cost of items in order
   public double getCost() {
      return costPerItem*quantity;
   }
   
   //sets the quantity to given amount
   public void setQuantity(int q) {
      this.quantity = q;
   }      
   
   //returns the name of the item
   public String toString() {
      return name;
   }   
   
}