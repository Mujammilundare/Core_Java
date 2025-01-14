import java.net.*;
import java.io.*;

class server
	 {
	public static void main (String [] args) throws Exception
	{
        ServerSocket ss = new ServerSocket(8765);
		System.out.println("before accept");  
		Socket insocket = ss.accept();
		System.out.println("after accept"); 
	
		BufferedReader in = new BufferedReader(new InputStreamReader(insocket.getInputStream() ) );
		PrintWriter out = new PrintWriter(insocket.getOutputStream());  //remote true and try
		// out.flush(); //empty flushing
		String instr = in.readLine();  //receive helloGod from client
        out.println("The server got this " +instr);  // to the client in its inputsteam
		out.flush();  // if not using true flush it mannualy
		insocket.close();
    	
      }
}
	

// demo for flush also








