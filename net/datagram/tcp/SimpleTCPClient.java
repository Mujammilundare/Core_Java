import java.net.*;
import java.io.*;

public class SimpleTCPClient
	{
		public static void main(String[] args) 
			throws IOException, InterruptedException   //as sleepmethod
			{
InetAddress addr = InetAddress.getByName(null);  //127.0.0.1 can also be used
    	//System.out.println("getbyName() = " + addr);
        Socket socket=null;	
	 try
	{
		 socket = new Socket(addr,SimpleTCPServer.PORT);  // i.e 8888
        // System.out.println("socket succesful " + socket);
	
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter( new BufferedWriter( new OutputStreamWriter( socket.getOutputStream()) ),true);

			for(int i = 0;i<=5; i ++)
				{
				// will go to server
		        out.println("C "+i);  //send it to server
				Thread.sleep (3000);
		        String str = in.readLine();
		        System.out.println("reading back from server"+str);
	           }
				out.println("END");  //comment it for exception on server nullpointer still serverclose due to finally
		}  //end of try
		finally{
				System.out.println("     ......client closing...");
				socket.close();
				  }
	}  //end of main
}