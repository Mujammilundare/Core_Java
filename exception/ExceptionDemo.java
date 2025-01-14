class  ExceptionDemo
{
	public static void main(String[] args) 
	{
		try
		{

			int c=10/0;
          System.out.println(c);
		}
		catch(NullPointerException  e)
		{
					 System.out.println("Opps1"+e);
		}
		catch(Exception  e)
		{
    		System.out.println("Opps2..............");
		}
		

	} //end of main

}
