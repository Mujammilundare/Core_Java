class ssiexception extends Exception
{
	ssiexception(String str)
	{
		super(str);
	}
}

class Rock
{

	 void display ()throws ssiexception
	{

	 throw new ssiexception("timepass not allowed!!");
	}
}
	class userdefined0
	{
		public static void main(String[] args) throws Exception
		{
			Rock ob = new Rock ();
			try
			{
				ob.display();
			}
			catch(ssiexception e)
			{
				System.out.println("Opps!!"+e);
			   throw e;
			}
		}
	}