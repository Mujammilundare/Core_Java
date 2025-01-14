import java.net.*;
import java.io.*;
// This class represents a socket for sending and receiving datagram packets. 

class DataServer
{
	public static DatagramSocket ds;
	public static int cPort = 7000, sPort = 7900;

	public static void main(String arg[]) throws Exception
	{
		byte b[] = new byte[1024];
		ds = new DatagramSocket ();

		BufferedReader br = new BufferedReader (new InputStreamReader (System.in) );
		System.out.println ("Server waits for input .. Type 'end' to stop on a new line");
		InetAddress addr = InetAddress.getByName("localhost");
		//System.out.println ("Connected to : " + addr);

		while (true)
		{
			String str = br.readLine();
			if ( ( str == null || str.equals ("end") ) )
				break;
		    b = str.getBytes();
				ds.send (new DatagramPacket (b, b.length, addr, cPort));
        }
		String s = "end";
		b = s.getBytes();
		ds.send (new DatagramPacket (b, b.length, addr, cPort));
	}
}


/* Three ctrs--
DatagramSocket()    // interesting  any port
          Constructs a datagram socket and binds it to any available port on the local host machine. 
DatagramSocket(int port) 
          Constructs a datagram socket and binds it to the specified port. 
DatagramSocket(int port, InetAddress laddr) 
          

four ctrs--
WHERE	byte array and length is must but 
  simlarly inetaddress and port are friends 

1.DatagramPacket(byte[] buf, int length) 
          
2. DatagramPacket(byte[] buf, int length, InetAddress address, int port) 

3.DatagramPacket(byte[] buf, int offset, int length) 

4.DatagramPacket(byte[] buf, int offset, int length, InetAddress address, int port) 

*/