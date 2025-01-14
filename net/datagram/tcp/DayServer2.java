import java.net.*;
import java.io.*;
import java.util.*;

public class DayServer2
	{ 
		ServerSocket ss;
		public static final int PORT=1300;
	
     public static void main(String args[]) throws IOException
		{
			 DayServer2 ob = new DayServer2();
			 ob.go();
		}
		
			public void go() throws IOException
			{ 
				Socket s =null;
				ss= new ServerSocket(PORT,5);
				for (; ; )
				{
					System.out.println("before accept");
		        	s=ss.accept();
				       System.out.println("I am server");
					   BufferedWriter out = new BufferedWriter ( new OutputStreamWriter (s.getOutputStream() ,"8859_1" ) );
				     //server writer to the client
					 out.write("Java daytime server:"+(new Date() ).toString() +"\n");

					out.close();
					s.close();
			   }
          } //end of go
	}
			 

