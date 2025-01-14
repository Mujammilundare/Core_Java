import java.net.*;
import java.io.*;

public class DayClient1
	{ 
		public static final int PORT=13;
		String host;
		Socket s;
		
		public DayClient1(String host)
		{
			this.host=host;
		}

         public static void main(String args[]) throws IOException
		{
			 DayClient1 ob = new DayClient1(args[0]);
			 ob.go();
		}
		
			public void go() throws IOException
			{
				s= new Socket(host ,PORT);  
				//reading from server
				BufferedReader in = new BufferedReader (new InputStreamReader (s.getInputStream() ) );
				System.out.println(in.readLine());
				in.close();
				s.close();
			}
}

			 

