
/*
Arrays are passed to functions by reference, or as a pointer to the original.
This means anything you do to the Array inside the function affects the original.
*/
class ArrayDemo
	{
   public static void passByReference(String a[])
	   {
          a[0] = "Changed";
      }
 
   public static void main(String args[])
	   {
      String []b={"Apple","Mango","Orange"};
      System.out.println("Before Function Call    "+b[0]);
      passByReference(b);
      System.out.println("After Function Call    "+b[0]);
   }
}