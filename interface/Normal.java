interface Apple
	{ 
			public void eat();
     }
	

class Normal  implements Apple
	{
    
		public void eat()
		{
			System.out.println(" an Apple a day...");
		}

	public static void main (String args[])
		{

				Apple n = new Normal();
				n.eat();
    	}
	}


	class Abc
	{
	}

