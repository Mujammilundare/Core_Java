//how server sends message to the client
//localport increameted

import java.net.*;
import java.io.*;

class client
	 {
	public static void main (String [] args) throws Exception 
	{	
		int c;
		Socket socket = new Socket("127.0.0.1",8765);
		
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();

		String str = "Hello Divine God!\n";
		byte buffer [ ] = str.getBytes();
		out.write(buffer);  //send hello God  to  server

		while ((c = in.read() ) != -1)  //now read the enite data send from servr
		{
			System.out.print((char) c);  
		}
		socket.close();
	}
}