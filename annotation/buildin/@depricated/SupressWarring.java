class SupressWarring 
{
	public static void main(String[] args) 
	{
		int i=2;
		switch(i)
		{
			case 1:
				System.out.println("1");
			     break;
			case 2:
				System.out.println("2");
    			 //    break; //falling through
			case 3:
				System.out.println("3");
		}
	
	
	}
}
