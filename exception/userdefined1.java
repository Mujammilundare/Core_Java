class ssiexception extends Exception
{
	

}
class Rock
{

	 void display ()throws ssiexception
	{
	 
		 throw new ssiexception();
	}
}
	class userdefined1
	{
		public static void main(String[] args)
		{
			Rock ob = new Rock ();
			try
			{
				ob.display();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}