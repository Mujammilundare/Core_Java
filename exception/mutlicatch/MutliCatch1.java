public class MutliCatch1
	{

  public static void main(String... args) 
	  {
    String result = null;
    String a = "hello";
    result = a;
    //System.out.println(Integer.parseInt(result));
  //  System.exit(0);

/*
 try {
      System.out.println("This is the result: " + Integer.parseInt(result));
    } catch (Exception e) 
     {
      System.out.println("Cannot print result as result is not numeric, it is \"" + result + "\"");
      }
    System.exit(0);
  
  }
*/

/*
try {
       System.out.println("This is the result: " + Integer.parseInt(result));
      }
	  catch (NumberFormatException e) 
		  {
              System.out.println("Cannot print result as result is not numeric, it is \"" + result + "\".");
          }
		  catch (NullPointerException e) 
			  {
                     System.out.println("result is null.");
               }

	  }
  }
*/


try 
	{
         System.out.println("This is the result: " + Integer.parseInt(result));
     }
	 catch (NumberFormatException | NullPointerException e) 
		 {
           System.out.println("Cannot print result as result is not numeric, it is \"" + result + "\".");
        }
	  }
	}
