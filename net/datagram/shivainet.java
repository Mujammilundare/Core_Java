import java.net.*;

class shivainet 
{
	public static void main(String[] args) 
	{

		try
		{
			if (args.length != 1) 
				{
				      		System.out.println("Usage: java shivainet hostname ");
						return;
			    }

			InetAddress host = InetAddress.getByName(args[0]);
//			String str = host.getHostName();
			System.out.println("host " +host);
			System.out.println("Host Name: "+host.getHostName());
			System.out.println("IP address: " +host.getHostAddress());
		}
		catch(UnknownHostException e)
		{		System.out.println("I DONT NO WHO U ARE?");
	        //return;
		}
	}
}
