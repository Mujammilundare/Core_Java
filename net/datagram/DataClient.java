import java.io.*;
import java.net.*;
//  Multiple packets sent from one machine to another might 
//be routed differently, and might arrive in any order. 

class DataClient
{
	public static void main(String arg[]) throws Exception
	{   
		DatagramSocket ds;
		byte b[] = new byte[1024];
		int clport=7000;
		ds = new DatagramSocket (clport);

		System.out.println("Client waits for server");
				
		while(true)
		{
			DatagramPacket p = new DatagramPacket(b,b.length);
		    ds.receive(p);
	        // byte[] getData() 	Returns the data received or the data to be sent.
			//converts byte arr to string 
			String psx=new String(p.getData(),0,p.getLength()); 
			

		if (psx.equals("end"))
			{
				System.out.println("Connection Ended ..");
				System.exit(0);
			}
			else 
				System.out.println(psx);
		    }
	}
}

/*public String(byte[] bytes,
              int offset,
              int length)
Construct a new String by converting the specified subarray of bytes using the 
platform's default character encoding. The length of the new String is a function of the encoding, and
hence may not be equal to the length of the subarray.
Parameters:
bytes - The bytes to be converted into characters
offset - Index of the first byte to convert
length - Number of bytes to convert

*/
