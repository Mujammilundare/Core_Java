 enum Color implements Runnable
	{
WHITE, BLACK, RED, YELLOW, BLUE;

public void run() 
	{
	System.out.println("name()=" + name() +", toString()=" + toString());
 	}

//public abstract String color();

}



class  TestInter
{
public static void main(String[] args) 
	{

for(Color c : Color.values()) 
	{
		c.run();
    }
	
for(Runnable r : Color.values()) 
	{
		r.run();
	}

//String color()
	//	{
	//return "kya color hai!";
		//}

	}
}


