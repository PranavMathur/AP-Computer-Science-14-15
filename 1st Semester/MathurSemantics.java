import java.util.*;

public class MathurSemantics {
   public static void main(String[] args) {
      // value semantics - behavior where values are copied when
      // assigned, passed as parameters, or returned
      
      // all primitive types in Java are value semantics
      
      // When one variable is assigned to another, its value
      // is copied
      
      // Modifying the value of one variable does not affect
      // others. Each has a unique memory address.
      
      // Pass by value
      
      // Example:
      int x = 5;
      int y = x;
      System.out.println(x + " " + y);
      x = 6;
      System.out.println(x + " " + y);
      y = 7;
      System.out.println(x + " " + y);


      
      // reference semantics - behavior where variables
      // actually store the ADDRESS of an object in memory.
      
      // When one variable is assigned to another, 
      // the object is NOT copied.
      // Both variables refer to the same object.
      
      // Modifying the value of one variable will affect
      // others.
      
      // Pass by value, too - but value is a reference 
      // for objects, so some say pass by reference
      
      // AP says all are pass by value, with objects
      // is a reference to the data (is a memory address)
      
      // Arrays are objects
      // In memory, there is the variable that stores a 
      // reference to the array and there is the object
      // Array elements can be objects or primitives.
      // but must be the same type for a given array
      
      // Example:
      
      /* Arrays and objects use reference semantics 
         because ......
         efficiency - copying large objects slows down
         a program
         sharing - useful to share object's data 
         among methods
      */
      
      /* When a primitive is passed as a parameter, the
         primitive is copied. The parameter is a
         copy of the value in the passed primitive. 
         If the parameter is modified, it will NOT
         affect the original primitive.
      */
      // Example:

      int a = 10;
      double b = 4.;
      boolean t = false;
      System.out.println(a + " " + b + " " + t + " ");
      change(a, b, t);
      System.out.println(a + " " + b + " " + t + " ");
      
      
      
      /* When an object is passed as a parameter, the 
         object is NOT copied. The parameter REFERS
         to the same object. If the parameter is
         modified, it will affect the original object.
      */
      // Example: Array of Strings
      
      String[] f = {"A", "B", "C", "D"};
      System.out.println("Before: " + Arrays.toString(f));
      swapNames(f, 1, 2);
      System.out.println("After: " + Arrays.toString(f));

      
      // Example: Array of ints and int

      
      //Example: String is immutable

      
      // Example: Arrays of Strings and String

      
      // null - Java keyword signifying no object
      
      // declare variable s1 of type String
      // do not create an object or assign anything to s
      // detfault assigment is null
      String s1; 
      // declare variable s2 of type String
      // explicity assign null to variable s
      String s2  = null; 
      // declare variable s3 of type String
      // create and assign the object "" to s3
      String s3 = "";
      
      // What happens when the following statements execute?
      // Uncomment and try each, one at a time
      //int num1 = s1.compareTo("");
      //System.out.println(num1);
      //int num2 = s2.compareTo("");
      //System.out.println(num2);
      //int num3 = s3.compareTo("");
      //System.out.println(num3);
     
   }
   
   public static void change(int a , double b, boolean t) {
      a++;
      b++;
      t = !t;
      System.out.println(a + " " + b + " " + t + " ");
   }      
   
   public static void swapNames(String[] arr, int a, int b) {
      String temp = arr[b];
      arr[b] = arr[a];
      arr[a] = temp;
      System.out.println("During: " + Arrays.toString(arr));
   }   
 
}


