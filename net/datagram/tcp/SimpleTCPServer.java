//no for loop
import java.io.*;
import java.net.*;

public class SimpleTCPServer 
	{
	public static final int PORT = 8888;

	public static void main(String[] args) throws IOException 
	{
		ServerSocket s = new ServerSocket(PORT);
		//System.out.println("server started: "+s);
		try {
			// Blocks until a connection occurs:
			System.out.println("before accept()");
			Socket socket= s.accept();
			System.out.println("after accept()");
			//System.out.println("server started: "+socket);
			try {
					//System.out.println("Connection accepted: "+ socket);
					BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
					
					while (true) 
						{  
						String str = in.readLine();  //read from client
						if (str.equals("END")) 
							break;
						System.out.println("that's what i gotfrom client" + str);
						out.println(str);  //send it to client  
						//out.flush(); //proper place to flush
				    }
			}  //end of  inner try
			finally {
					System.out.println("     ... server closing...");
					socket.close();
						}
		} //end of  outer try
		finally {
			       s.close();
	        	  }
	}  //end of main
}