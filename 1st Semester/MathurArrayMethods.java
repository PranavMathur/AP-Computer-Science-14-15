import java.util.*;
public class MathurArrayMethods {
   public static void main(String args[]) {/*
      int[][] arr = new int[4][4];
      System.out.println(Arrays.deepToString(arr));
      setValues(arr);
      System.out.println(Arrays.deepToString(arr));
      arr = new int[][] {{1, 4, 6}, {7, 2, 5}, {9, 8, 3}};
      reverseValues(arr);
      System.out.println(Arrays.deepToString(arr));*/
      
   }
   
   public static void setValues(int[][] arr) {
      for (int i = 0; i < 4; i++)
         arr[2][i] = 3;
      for (int[] i : arr)
         i[3] = 4;
   }         
   
   public static void reverseValues(int[][] arr) {
      for (int[] i : arr) {
         int temp = 0;
         for (int j = 0, k = i.length-1; j != k; j++, k--) {
            temp = i[j];
            i[j] = i[k];
            i[k] = temp;
         }
      }
   }         //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
   
}  

        