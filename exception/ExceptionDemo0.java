class  ExceptionDemo0
{
	public static void main(String[] args) 
	{
		try
		{

	int c=10/0;
    System.out.println(c);
	
		}
		catch(ArithmeticException  e)
		{

					 System.out.println("Opps1"+e);

          }
		  finally
		{
			  System.out.println("come what may!!");
		}

		

	} //end of main

}
