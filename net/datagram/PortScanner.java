import java.io.*;
import java.net.*;
public class PortScanner
	{
       	final static int LOW_RANGE=0;
		final static int HIGH_RANGE=1023;
   public static void main (String [] args)
	{
		 Socket s = null;
		 String host = "localhost"; //defaults to local host
		 if (args.length >0)
		 {
			 host = args[0];  //set host to command line parameter 
    	 }
		 for (int i =LOW_RANGE;i<HIGH_RANGE;i++ )
		 {
			 System.out.println("Checking the port "+i+"....");
				 try {
					 s =new Socket(host,i);
					 System.out.println("Server responding on port " +i+ " of " +host);
					 }
				   catch (IOException e)
					 {
						  System.out.println("No server found ");
					 }
			  finally
			 {
				   try
				 {
					   s.close();
				 }
				 catch (Exception e)
					 {     }
			 }  // end of finally
		 } // end of loop
	}   // end of main

}