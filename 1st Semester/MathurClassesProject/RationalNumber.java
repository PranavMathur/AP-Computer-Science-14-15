/* A rational number expressed with a numerator and denominator
   by Pranav Mathur
   12 December 2014
*/

public class RationalNumber {
   
   private int n; //numerator
   private int d; //denominator
   
   //constructs number out of given numerator and denominator
   public RationalNumber(int n, int d) {
      if (d == 0) throw new IllegalArgumentException();
      this.n = n;
      this.d = d;
   }
   
   //default constructor sets number to 0
   public RationalNumber() {
      this(0, 1);
   }
   
   //accessors
   public int getDenominator() {
      return d;
   }
   
   public int getNumerator() {
      return n;
   }         
   
   //returns text representation of number
   public String toString() {
      if (d == 1) {
         return n + "";
      }
      return n + "/" + d;
   }
   
   //returns a new rationalnumber which represents the sum of the previous two
   public RationalNumber add(RationalNumber other) {
      return new RationalNumber(this.n*other.d + other.n*this.d, this.d*other.d);
   }      
   
   //returns a new rationalnumber which represents the difference of the previous two
   public RationalNumber subtract(RationalNumber other) {
      return add(new RationalNumber(-1*other.n, other.d));
   }   
   
}