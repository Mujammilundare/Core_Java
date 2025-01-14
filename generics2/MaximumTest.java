public class MaximumTest
{
   // determines the largest of three Comparable objects
   public static <T extends Comparable<T>> T maximum(T x, T y, T z)
   {                      
      T max = x; // assume x is initially the largest       
      if ( y.compareTo( max ) > 0 ){
         max = y; // y is the largest so far
      }
      if ( z.compareTo( max ) > 0 ){
         max = z; // z is the largest now                 
      }
      return max; // returns the largest object   
   }
   public static void main( String args[] )
   {
      System.out.println(maximum( 3, 4, 5 ) );
       System.out.println(maximum( 6.6, 8.8, 7.7 ) );
       System.out.println( maximum( "pear", "apple", "orange" ) );
   }
}
