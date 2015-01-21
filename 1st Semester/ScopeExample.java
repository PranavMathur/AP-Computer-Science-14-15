public class ScopeExample {
   public static void main(String[] args) {
      //for (int f = 0; f < 100; f++)
         //System.out.println(fib((long)f) + " " + f);
      long[] times = new long[100];
      times[0] = times[1] = 1;
      for (int i = 2; i < times.length; i++)
         times[i] = times[i-2]+times[i-1];   
      for (long i : times)
         System.out.println(i);   
   }
   
   public static long fib(long n) {
      return n == 0L || n == 1L ? 1 : fib(n-1) + fib(n-2);
   }   
}         