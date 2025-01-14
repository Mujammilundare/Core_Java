public class Server implements PrintService 
	{
    @Property
    protected String header = "->";
    private int count = 1;
    
    /** Default constructor. */
    public Server() 
		{
            System.out.println("SERVER created.");
        }
    
    /** PrintService implementation. */
    public void print(final String msg) 
		{
        System.out.println("SERVER: begin printing...");
               
			    for (int i = 0; i < count; ++i) 
			    System.out.println(header + msg);
            
        System.out.println("SERVER: print done.");
        }


public static void main(String[] args) 
	{
Server s=Server() ;
s.print();
	}
}