import java.net.*;

public class Inet
	{
	public static void main (String [] args)
	{
		System.out.println("Inet.java");
	
	    InetAddress add1  =  InetAddress.getLocalHost(); //no patameter
		System.out.println("getLocalHost() :" +add1);  
                                  
		}
		catch(UnknownHostException e)
		{
			System.out.println(e);
		}

   	}
}