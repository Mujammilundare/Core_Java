
public class Varargs1 
	{ 

  void test(int some, String... args) 
	{ 
	System.out.print("\n" + some); 
	
	for(String s: args) 
	{ 
		System.out.print(", " + s); 
	} 
} 

public static void main(String args[]) 
	{ 
	Varargs1 ob=new Varargs1();
		ob.test(215, "India", "Delhi"); 
		ob.test(147, "United States", "New York", "California"); 
    	ob.test(147, "US", "UK", "UAE","USSR"); 

	} 

	}