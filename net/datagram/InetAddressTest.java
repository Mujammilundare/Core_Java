import java.net.*;

class InetAddressTest
{
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress add = InetAddress.getLocalHost(); //IP address of machine.
		System.out.println ( add );
		add = InetAddress.getByName("sys6");
		System.out.println("IP address of NtServer_adh : " + add);  //IP address of NtServer.
		
		InetAddress sw=InetAddress.getByName("Ora9i_adh"); //IP address of oracle server
		System.out.println(sw);

		sw = InetAddress.getByName (null);
		System.out.println ( "This is LocalHost : " + sw );
	}
}