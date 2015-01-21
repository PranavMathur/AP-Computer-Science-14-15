/* A Grocery list that stores items in an array
   by Pranav Mathur
   12 December 2014
*/

public class GroceryList {
   
   //fields
   private GroceryItemOrder[] items;
   private int currentIndex = 0;
   
   //default constructor
   public GroceryList() {
      this.items = new GroceryItemOrder[10];
   }
   
   //adds a groceryitemorder to the grocerylist
   public void add(GroceryItemOrder item) {
      if (currentIndex < 10) 
         items[currentIndex++] = item;
   }      
   
   //returns the total cost of the lost
   public double getTotalCost() {
      double cost = 0.0;
      for (int i = 0; i < currentIndex; i++) {
         cost += items[i].getCost();
      }
      return cost;
   }      
   
}