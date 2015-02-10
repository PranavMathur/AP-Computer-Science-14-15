public class Item {
   
   private String name;
   private double price;
   private int bulkQuantity = 1;
   private double bulkPrice = 0;

   public Item(String name, double price) {
      if (price < 0)
         throw new IllegalArgumentException("Price (" + price + ") must not be negative");
      this.name = name;
      this.price = price;   
      this.bulkPrice = price;
   }   
   
   public Item(String name, double price, int bulkQuantity, double bulkPrice) {
      this(name, price);
      this.bulkQuantity = bulkQuantity;
      this.bulkPrice = bulkPrice;
   }   
   
   public double priceFor(int quantity) {
      if (quantity < 0) 
         throw new IllegalArgumentException();
      
      return bulkPrice*(quantity/bulkQuantity) + price*(quantity%bulkQuantity);     
   }   
   
   public String toString() {
      String retStr = this.name + ", $" + String.format("%.2f", price);
      if (bulkQuantity != 1)
         retStr += " (" + bulkQuantity + " for " + String.format("%.2f", bulkPrice) + ")";
      return retStr;   
   }

}